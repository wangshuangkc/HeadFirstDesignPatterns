package states;

import context.GumballMachine;
import exceptions.InvalidActionForStateException;

/**
 * Reactions by no quarter state to actions
 * Only allow insert-quater action, and throw exceptions for others
 */
public class NoQuaterState implements State {

  private GumballMachine gumballMachine;

  public NoQuaterState(final GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuater() {
    gumballMachine.setState(gumballMachine.HAS_QUATER);
  }

  @Override
  public void ejectQuater() {
    throw new InvalidActionForStateException("No quater inserted.");
  }

  @Override
  public void turnCrank() {
    throw new InvalidActionForStateException("No quater inserted.");
  }

  @Override
  public int dispense() {
    throw new InvalidActionForStateException("No quater inserted.");
  }
}
