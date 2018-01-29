package boilderstates;

import exceptions.InvalidActionForStateException;
import singleton.ChocolateBoiler;

public class BoilerEmptyState implements BoilerState{

  private ChocolateBoiler chocolateBoiler;

  public BoilerEmptyState(ChocolateBoiler chocolateBoiler) {
    this.chocolateBoiler = chocolateBoiler;
  }

  @Override
  public void fill() {
    System.out.println("Fill the chocolate boiler");
    chocolateBoiler.setState(new BoilerFilledState(chocolateBoiler));
  }

  @Override
  public void drain() {
    throw new InvalidActionForStateException("Invalid to drain empty chocolate boiler.");
  }

  @Override
  public void boil() {
    throw new InvalidActionForStateException("Invalid to boil empty chocolate boiler.");
  }
}
