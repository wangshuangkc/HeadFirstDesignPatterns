package states;

import context.GumballMachine;

/**
 * Reactions by winner state to actions
 * Only allow dispense action, and throw exceptions for others
 */
public class WinnerState extends SoldState {

  private GumballMachine gumballMachine;

  public WinnerState(final GumballMachine gumballMachine) {
    super(gumballMachine);
    this.gumballMachine = gumballMachine;
  }

  @Override
  public int dispense() {
    if (gumballMachine.getCnt() > 2) {
      gumballMachine.setState(gumballMachine.NO_QUATER);
    } else {
      gumballMachine.setState(gumballMachine.EMPTY);
    }

    return 2;
  }
}
