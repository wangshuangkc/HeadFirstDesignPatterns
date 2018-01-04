package beverage.coffee;

import beverage.Beverage;

public class DarkRoast extends Beverage {

  private static final String DESCRIPTION = "Dark Roast Coffee";
  private static final double COST = 0.99;

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }

  @Override
  public double getCost() {
    return COST;
  }
}
