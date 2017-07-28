package states;

import context.GumballMachine;
import exceptions.InvalidActionForStateException;

/**
 * Reactions by empty state to actions
 * Throw exceptions for all actions
 */
public class EmptyState implements State {

  private GumballMachine gumballMachine;

  public EmptyState(final GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuater() {
    throw new InvalidActionForStateException("Out of gumball.");
  }

  @Override
  public void ejectQuater() {
    throw new InvalidActionForStateException("Out of gumball.");
  }

  @Override
  public void turnCrank() {
    throw new InvalidActionForStateException("Out of gumball.");
  }

  @Override
  public int dispense() {
    throw new InvalidActionForStateException("Out of gumball.");
  }
}
