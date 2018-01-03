package beverage.coffee;

import beverage.Beverage;

public class HouseBlend extends Beverage {

  private static final String DESCRIPTION = "House Blend Coffee";
  private static final double COST = 0.89;

  public HouseBlend() {
    this.description = DESCRIPTION;
    this.cost = COST;
  }
}
