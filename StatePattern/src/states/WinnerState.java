package states;

import context.GumballMachine;

/**
 * Reactions by winner state to actions
 * Only allow dispense action, and throw exceptions for others
 */
public class WinnerState implements State {

  private GumballMachine gumballMachine;

  public WinnerState(final GumballMachine gumballMachine) {
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
