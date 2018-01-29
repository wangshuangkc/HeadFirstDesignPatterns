package boilderstates;

import exceptions.InvalidActionForStateException;
import singleton.ChocolateBoiler;

public class BoilerFilledState implements BoilerState{

  private ChocolateBoiler chocolateBoiler;

  public BoilerFilledState(ChocolateBoiler chocolateBoiler) {
    this.chocolateBoiler = chocolateBoiler;
  }

  @Override
  public void fill() {
    throw new InvalidActionForStateException("The chocolate boiler is already filled.");
  }

  @Override
  public void drain() {
    throw new InvalidActionForStateException("The chocolate boiler is not yet boiled.");
  }

  @Override
  public void boil() {
    System.out.println("Boil the chocolate boiler.");
    chocolateBoiler.setState(new BoilerBoiledState(chocolateBoiler));
  }
}
