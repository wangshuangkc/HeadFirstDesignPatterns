package states;

import context.GumballMachine;

/**
 * Abstract State
 */
public interface State {

  public void insertQuater();

  public void ejectQuater();

  public void turnCrank();

  public void dispense();
}
