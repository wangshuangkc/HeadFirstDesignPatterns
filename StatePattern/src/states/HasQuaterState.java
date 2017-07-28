package states;

import context.GumballMachine;
import exceptions.InvalidActionForStateException;

import java.util.Random;

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
    throw new InvalidActionForStateException("Quater has been inserted.");
  }

  @Override
  public void ejectQuater() {
    gumballMachine.setState(gumballMachine.NO_QUATER);
  }

  @Override
  public void turnCrank() {
    final Random winner_gennerator = new Random(gumballMachine.WINNER_BASE);
    if (winner_gennerator.nextInt() == 0) {
      gumballMachine.setState(gumballMachine.WINNER);
    } else {
      gumballMachine.setState(gumballMachine.SOLD);
    }
  }

  @Override
  public int dispense() {
    throw new InvalidActionForStateException("Cannot dispense before turn crank");
  }
}
