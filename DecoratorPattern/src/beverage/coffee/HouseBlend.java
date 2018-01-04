package beverage.coffee;

import beverage.Beverage;

public class HouseBlend extends Beverage {

  private static final String DESCRIPTION = "House Blend Coffee";
  private static final double COST = 0.89;

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }

  @Override
  public double getCost() {
    return COST;
  }
}
