package states;

import context.GumballMachine;
import exceptions.InvalidActionForStateException;

/**
 * Reactions by sold state to actions
 * Only allow dispense action, and throw exceptions for others
 */
public class SoldState implements State {

  private GumballMachine gumballMachine;

  public SoldState(final GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuater() {
    System.out.println("Quater has been inserted.");
  }

  @Override
  public void ejectQuater() {
    System.out.println("Cannot eject quater after turn crank.");
  }

  @Override
  public void turnCrank() {
    System.out.println("Crank has been turned.");
  }

  @Override
  public int dispense() {
    if (gumballMachine.getCnt() > 1) {
      gumballMachine.setState(gumballMachine.NO_QUATER);
    } else {
      gumballMachine.setState(gumballMachine.EMPTY);
    }

    return 1;
  }
}
