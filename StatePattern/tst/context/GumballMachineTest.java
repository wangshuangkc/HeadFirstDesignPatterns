package context;

import exceptions.InvalidActionForStateException;
import org.junit.Before;
import org.junit.Test;
import states.*;

import static org.junit.Assert.*;

public class GumballMachineTest {

  private GumballMachine mockGumballMachine;
  private State mockNoQuaterState;
  private State mockHasQuaterState;
  private State mockSoldState;
  private State mockWinnerState;
  private State mockEmptyState;

  @Before
  public void setup() {
    mockGumballMachine = new GumballMachine();
    mockNoQuaterState = new NoQuaterState(mockGumballMachine);
    mockHasQuaterState = new HasQuaterState(mockGumballMachine);
    mockSoldState = new SoldState(mockGumballMachine);
    mockWinnerState = new WinnerState(mockGumballMachine);
    mockEmptyState = new EmptyState(mockGumballMachine);
  }

  @Test
  public void testInsertQuater_NoQuater() {
    mockGumballMachine.insertQuater();
    assertTrue(mockGumballMachine.getState() instanceof HasQuaterState);
  }

  @Test
  public void testInsertQuater_HasQuater() {
    mockGumballMachine.setState(mockHasQuaterState);
    mockGumballMachine.insertQuater();
    assertTrue(mockGumballMachine.getState() instanceof HasQuaterState);
  }

  @Test
  public void testInsertQuater_Sold() {
    mockGumballMachine.setState(mockSoldState);
    mockGumballMachine.insertQuater();
    assertTrue(mockGumballMachine.getState() instanceof SoldState);
  }

  @Test
  public void testInsertQuater_Winner() {
    mockGumballMachine.setState(mockWinnerState);
    mockGumballMachine.insertQuater();
    assertTrue(mockGumballMachine.getState() instanceof WinnerState);
  }

  @Test
  public void testInsertQuater_Empty() {
    mockGumballMachine.setState(mockEmptyState);
    mockGumballMachine.insertQuater();
    assertTrue(mockGumballMachine.getState() instanceof EmptyState);
  }

  @Test
  public void testEjectQuater_HasQuater() {
    mockGumballMachine.setState(mockHasQuaterState);
    mockGumballMachine.ejectQuater();
    assertTrue(mockGumballMachine.getState() instanceof NoQuaterState);
  }

  @Test
  public void testEjectQuater_NoQuater() {
    mockGumballMachine.ejectQuater();
    assertTrue(mockGumballMachine.getState() instanceof NoQuaterState);
  }

  @Test
  public void testEjectQuater_Sold() {
    mockGumballMachine.setState(mockSoldState);
    mockGumballMachine.ejectQuater();
  }

  @Test
  public void testEjectQuater_WinnerQuater() {
    mockGumballMachine.setState(mockWinnerState);
    mockGumballMachine.ejectQuater();
    assertTrue(mockGumballMachine.getState() instanceof SoldState);
  }

  @Test
  public void testEjectQuater_Empty() {
    mockGumballMachine.setState(mockEmptyState);
    mockGumballMachine.ejectQuater();
    assertTrue(mockGumballMachine.getState() instanceof EmptyState);
  }

  @Test
  public void testTurnCrank_HasQuater() {
    mockGumballMachine.setState(mockHasQuaterState);
    mockGumballMachine.turnCrank();
    assertTrue(mockGumballMachine.getState() instanceof NoQuaterState
        || mockGumballMachine.getState() instanceof EmptyState);
  }

  @Test
  public void testTurnCrank_NoQuater() {
    mockGumballMachine.turnCrank();
    assertTrue(mockGumballMachine.getState() instanceof NoQuaterState);
  }

  @Test
  public void testTurnCrank_Empty() {
    mockGumballMachine.setState(mockEmptyState);
    mockGumballMachine.turnCrank();
    assertTrue(mockGumballMachine.getState() instanceof EmptyState);
  }

  @Test
  public void testRefill_AddToFull() {
    final int full = mockGumballMachine.getCnt();
    mockGumballMachine.refill(1);
    assertEquals(full, mockGumballMachine.getCnt());
  }

  @Test
  public void testRefill_Empty() {
    mockGumballMachine.setState(mockEmptyState);
    mockGumballMachine.refill(10);
    assertFalse(mockGumballMachine.getState() instanceof EmptyState);
  }
}
