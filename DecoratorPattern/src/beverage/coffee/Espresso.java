package beverage.coffee;

import beverage.Beverage;

public class Espresso extends Beverage {

  private static final String DESCRIPTION = "Espresso Coffee";
  private static final double COST = 1.99;

  public Espresso() {
    this.description = DESCRIPTION;
    this.cost = COST;
  }
}
