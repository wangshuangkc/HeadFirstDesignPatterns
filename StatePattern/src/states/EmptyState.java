package states;

import context.GumballMachine;

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

  }

  @Override
  public void ejectQuater() {

  }

  @Override
  public void turnCrank() {

  }

  @Override
  public void dispense() {

  }
}
