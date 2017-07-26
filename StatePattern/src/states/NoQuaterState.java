package states;

import context.GumballMachine;

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
