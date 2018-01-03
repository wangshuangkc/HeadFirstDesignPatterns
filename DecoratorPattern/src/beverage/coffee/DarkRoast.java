package beverage.coffee;

import beverage.Beverage;

public class DarkRoast extends Beverage {

  private static final String DESCRIPTION = "Dark Roast Coffee";
  private static final double COST = 0.99;

  public DarkRoast() {
    this.description = DESCRIPTION;
    this.cost = COST;
  }
}
