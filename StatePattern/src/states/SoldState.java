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
    throw new InvalidActionForStateException("Quater has been inserted.");
  }

  @Override
  public void ejectQuater() {
    throw new InvalidActionForStateException("Cannot eject quater after turn crank.");
  }

  @Override
  public void turnCrank() {
    throw new InvalidActionForStateException("Crank has been turned.");
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
