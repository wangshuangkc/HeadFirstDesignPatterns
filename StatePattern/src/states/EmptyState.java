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
    System.out.println("Out of gumball.");
  }

  @Override
  public void ejectQuater() {
    System.out.println("Out of gumball.");
  }

  @Override
  public void turnCrank() {
    System.out.println("Out of gumball.");
  }

  @Override
  public int dispense() {
    System.out.println("Out of gumball.");
    return 0;
  }
}
