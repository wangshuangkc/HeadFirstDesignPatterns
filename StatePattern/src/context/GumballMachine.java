package context;

import states.*;

/**
 * Context class for holding state and trigger actions
 */
public class GumballMachine {
  private static final String NAME = "Mighty Gumball Machin Inc";
  private static final int DEFAULT_GUMBALL_FULL = 20;
  public static final int WINNER_BASE = 10;

  public static State NO_QUATER;
  public static State HAS_QUATER;
  public static State SOLD;
  public static State WINNER;
  public static State EMPTY;

  private int gumball_cnt;
  private State state;

  public GumballMachine() {
    NO_QUATER = new NoQuaterState(this);
    HAS_QUATER = new HasQuaterState(this);
    SOLD = new SoldState(this);
    WINNER = new WinnerState(this);
    EMPTY = new EmptyState(this);
    state = NO_QUATER;
    gumball_cnt = DEFAULT_GUMBALL_FULL;
  }

  /**
   * Action of inserting a quater
   */
  public void insertQuater() {
    state.insertQuater();
  }

  /**
   * Action of ejecting the inserted quater
   */
  public void ejectQuater() {
    state.ejectQuater();
  }

  /**
   * Action of turning crank
   */
  public void turnCrank() {
    state.turnCrank();
  }

  /**
   * Action of dispense the gumball
   */
  public void dispense() {
    final int dispensed_cnt = state.dispense();
    gumball_cnt -= dispensed_cnt;
  }

  /**
   * Action of refill the machine
   * @param cnt number of gumballs to refill
   */
  public void refill(final int cnt) {
    if (cnt < 0) {
      throw new IllegalArgumentException("Refill count cannot be negative");
    }
    final int total = gumball_cnt + cnt;
    gumball_cnt = total < DEFAULT_GUMBALL_FULL ? total : DEFAULT_GUMBALL_FULL;
    if (gumball_cnt > 0) {
      state = new NoQuaterState(this);
    }
  }

  public State getState() {
    return state;
  }

  public void setState(final State state) {
    this.state = state;
  }

  public int getCnt() {
    return gumball_cnt;
  }

  @Override
  public String toString(){
    return NAME + "\n"
        + "Gumball left: " + gumball_cnt;
  }
}
