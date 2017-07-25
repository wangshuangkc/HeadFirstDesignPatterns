package context;

import states.State;

/**
 * Context class for holding state and trigger actions
 */
public class GumballMachine {
  private static final String NAME = "Mighty Gumball Machin Inc";
  private int gumball_cnt;
  private State state;

  public GumballMachine(final State state) {
    this.state = state;
    gumball_cnt = 0;
  }

  /**
   * Action of inserting a quater
   */
  public void insertQuater() {}

  /**
   * Action of ejecting the inserted quater
   */
  public void ejectQuarter() {}

  /**
   * Action of turning crank
   */
  public void turnCrank() {}

  /**
   * Action of dispense the gumball
   */
  public void dispense() {}

  /**
   * Action of refill the machine
   * @param cnt number of gumballs to refill
   */
  public void refill(final int cnt) {}

  /**
   * Check if the machine has gumballs
   * @return true if the machine is not empty
   */
  public boolean hasGumball() {
    return gumball_cnt == 0;
  }

  public State getState() {
    return state;
  }

  public void setState(final State state) {
    this.state = state;
  }

  @Override
  public String toString(){
    return NAME + "\n"
        + "Gumball left: " + gumball_cnt;
  }
}
