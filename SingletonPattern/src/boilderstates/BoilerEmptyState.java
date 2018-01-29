package boilderstates;

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
    System.out.println("The chocolate boiler is empty to drain.");
  }

  @Override
  public void boil() {
    System.out.println("The chocolate boiler is empty to boil.");
  }
}
