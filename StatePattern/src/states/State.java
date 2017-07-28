package states;

/**
 * Abstract State
 */
public interface State {

  void insertQuater();

  void ejectQuater();

  void turnCrank();

  int dispense();
}
