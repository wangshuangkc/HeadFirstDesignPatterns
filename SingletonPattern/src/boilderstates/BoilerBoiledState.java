package boilderstates;

import singleton.ChocolateBoiler;

public class BoilerBoiledState implements BoilerState{

  private ChocolateBoiler chocolateBoiler;

  public BoilerBoiledState(ChocolateBoiler chocolateBoiler) {
    this.chocolateBoiler = chocolateBoiler;
  }

  @Override
  public void fill() {
    System.out.println("The chocolate boiler is already filled and boiled.");
  }

  @Override
  public void drain() {
    System.out.println("Drain the boiled chocolate.");
    chocolateBoiler.setState(new BoilerEmptyState(chocolateBoiler));
  }

  @Override
  public void boil() {
    System.out.println("The chocolate boiler is already boiled.");
  }
}
