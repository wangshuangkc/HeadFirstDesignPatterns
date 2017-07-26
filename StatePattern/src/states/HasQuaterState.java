package states;

import context.GumballMachine;

/**
 * Reactions by has-quarter state to actions
 * Allow eject-quarter and turn-crank actions, and throw exceptions for others
 */
public class HasQuaterState implements State {

  private GumballMachine gumballMachine;

  public HasQuaterState(final GumballMachine gumballMachine) {
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
