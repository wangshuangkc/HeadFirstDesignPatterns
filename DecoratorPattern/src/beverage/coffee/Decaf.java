package beverage.coffee;

import beverage.Beverage;

public class Decaf extends Beverage {

  private static final String DESCRIPTION = "Decaf Coffee";
  private static final double COST = 1.05;

  public Decaf() {
    description = DESCRIPTION;
  }

  @Override
  public double getCost() {
    return COST;
  }
}
