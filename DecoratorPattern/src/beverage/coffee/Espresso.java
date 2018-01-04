package beverage.coffee;

import beverage.Beverage;

public class Espresso extends Beverage {

  private static final String DESCRIPTION = "Espresso Coffee";
  private static final double COST = 1.99;

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }

  @Override
  public double getCost() {
    return COST;
  }
}
