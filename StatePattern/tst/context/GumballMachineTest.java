package context;

import exceptions.InvalidActionForState;
import org.junit.Before;
import org.junit.Test;
import states.*;

import static org.junit.Assert.*;

public class GumballMachineTest {

  private GumballMachine mockGumballMachine;
  private State mockNoQuaterState = new NoQuaterState(mockGumballMachine);
  private State mockHasQuaterState = new HasQuaterState(mockGumballMachine);
  private State mockSoldState = new SoldState(mockGumballMachine);
  private State mockWinnerState = new WinnerState(mockGumballMachine);
  private State mockEmptyState = new EmptyState(mockGumballMachine);

  @Before
  public void setup() {
    mockGumballMachine = new GumballMachine();
  }

  @Test
  public void testInsertQuater_NoQuater() {
    mockGumballMachine.insertQuater();
    assertTrue(mockGumballMachine.getState() instanceof HasQuaterState);
  }

  @Test(expected = InvalidActionForState.class)
  public void testInsertQuater_HasQuater() {
    mockGumballMachine.setState(mockHasQuaterState);
    mockGumballMachine.insertQuater();
  }

  @Test(expected=InvalidActionForState.class)
  public void testInsertQuater_Sold() {
    mockGumballMachine.setState(mockSoldState);
    mockGumballMachine.insertQuater();
  }

  @Test(expected = InvalidActionForState.class)
  public void testInsertQuater_Winner() {
    mockGumballMachine.setState(mockWinnerState);
    mockGumballMachine.insertQuater();
  }

  @Test(expected=InvalidActionForState.class)
  public void testInsertQuater_Empty() {
    mockGumballMachine.setState(mockEmptyState);
    mockGumballMachine.insertQuater();
  }

  @Test
  public void testEjectQuater_HasQuater() {
    mockGumballMachine.setState(mockHasQuaterState);
    mockGumballMachine.ejectQuater();
    assertTrue(mockGumballMachine.getState() instanceof NoQuaterState);
  }

  @Test(expected = InvalidActionForState.class)
  public void testEjectQuater_NoQuater() {
    mockGumballMachine.ejectQuater();
  }

  @Test(expected = InvalidActionForState.class)
  public void testEjectQuater_Sold() {
    mockGumballMachine.setState(mockSoldState);
    mockGumballMachine.ejectQuater();
  }

  @Test(expected = InvalidActionForState.class)
  public void testEjectQuater_WinnerQuater() {
    mockGumballMachine.setState(mockWinnerState);
    mockGumballMachine.ejectQuater();
  }

  @Test(expected = InvalidActionForState.class)
  public void testEjectQuater_Empty() {
    mockGumballMachine.setState(mockEmptyState);
    mockGumballMachine.ejectQuater();
  }

  @Test
  public void testTurnCrank_HasQuater() {
    mockGumballMachine.setState(mockHasQuaterState);
    mockGumballMachine.turnCrank();
    assertTrue(mockGumballMachine.getState() instanceof SoldState
        || mockGumballMachine.getState() instanceof WinnerState);
  }

  @Test(expected=InvalidActionForState.class)
  public void testTurnCrank_NoQuater() {
    mockGumballMachine.turnCrank();
  }

  @Test(expected = InvalidActionForState.class)
  public void testTurnCrank_Sold() {
    mockGumballMachine.setState(mockSoldState);
    mockGumballMachine.turnCrank();
  }

  @Test(expected = InvalidActionForState.class)
  public void testTurnCrank_WinnerQuater() {
    mockGumballMachine.setState(mockWinnerState);
    mockGumballMachine.turnCrank();
  }

  @Test(expected = InvalidActionForState.class)
  public void testTurnCrank_Empty() {
    mockGumballMachine.setState(mockEmptyState);
    mockGumballMachine.turnCrank();
  }

  @Test
  public void testDispense_Sold() {
    mockGumballMachine.setState(mockSoldState);
    final int currentCnt = mockGumballMachine.getCnt();
    mockGumballMachine.dispense();
    assertEquals(currentCnt - 1, mockGumballMachine.getCnt());
    assertTrue(mockGumballMachine.getState() instanceof NoQuaterState);
  }

  @Test
  public void testDispense_Winner() {
    mockGumballMachine.setState(mockWinnerState);
    final int currentCnt = mockGumballMachine.getCnt();
    mockGumballMachine.dispense();
    assertEquals(currentCnt - 2, mockGumballMachine.getCnt());
    assertTrue(mockGumballMachine.getState() instanceof NoQuaterState);
  }

  @Test(expected = InvalidActionForState.class)
  public void testDispense_NoQuater() {
    mockGumballMachine.dispense();
  }

  @Test(expected = InvalidActionForState.class)
  public void testDispense_HasQuater() {
    mockGumballMachine.setState(mockHasQuaterState);
    mockGumballMachine.dispense();
  }

  @Test(expected = InvalidActionForState.class)
  public void testDispense_Empty() {
    mockGumballMachine.setState(mockEmptyState);
    mockGumballMachine.dispense();
  }

  @Test
  public void testRefill_AddToFull() {
    final int full = mockGumballMachine.getCnt();
    mockGumballMachine.refill(1);
    assertEquals(full, mockGumballMachine.getCnt());
  }

  @Test
  public void testRefill_AddToNotFull() {
    final int full = mockGumballMachine.getCnt();
    mockGumballMachine.setState(mockWinnerState);
    mockGumballMachine.dispense();
    final int afterDispense = mockGumballMachine.getCnt();

    mockGumballMachine.refill(1);
    assertEquals(afterDispense + 1, mockGumballMachine.getCnt());

    mockGumballMachine.refill(10);
    assertEquals(full, mockGumballMachine.getCnt());
  }

  @Test
  public void testRefill_Empty() {
    mockGumballMachine.setState(mockEmptyState);
    mockGumballMachine.refill(10);
    assertFalse(mockGumballMachine.getState() instanceof EmptyState);
  }
}
