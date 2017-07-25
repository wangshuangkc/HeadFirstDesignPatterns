package states;

import context.GumballMachine;

/**
 * Abstract State
 */
public abstract class State {
  private GumballMachine gumballMachine;

  public State(final GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  public abstract void insertQuater();

  public abstract void ejectQuater();

  public abstract void turnCrank();

  public abstract void dispense();
}
