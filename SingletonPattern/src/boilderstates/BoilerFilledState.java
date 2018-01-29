package boilderstates;

import singleton.ChocolateBoiler;

public class BoilerFilledState implements BoilerState{

  private ChocolateBoiler chocolateBoiler;

  public BoilerFilledState(ChocolateBoiler chocolateBoiler) {
    this.chocolateBoiler = chocolateBoiler;
  }

  @Override
  public void fill() {
    System.out.println("The chocolate boiler is already filled.");
  }

  @Override
  public void drain() {
    System.out.println("The chocolate boiler is not yet boiled.");
  }

  @Override
  public void boil() {
    System.out.println("Boil the chocolate boiler.");
    chocolateBoiler.setState(new BoilerBoiledState(chocolateBoiler));
  }
}
