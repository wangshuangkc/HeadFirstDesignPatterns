package beverage.condiments;

import beverage.Beverage;
import beverage.Size;

public class Mocha extends Condiment {

  private static final String DESCRIPTION = ", Mocha";
  private static final double TALL_COST = 0.15;
  private static final double GRANTE_COST = 0.2;
  private static final double VENTI_COST = 0.25;

  public Mocha(Beverage beverage, Size size) {
    this.beverage = beverage;
    this.size = size;

    tallCost = TALL_COST;
    granteCost = GRANTE_COST;
    ventiCost = VENTI_COST;
  }

  public Mocha(Beverage beverage) {
    new Mocha(beverage, Size.GRANTE);
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + DESCRIPTION;
  }

  @Override
  public double getCost() {
    return getCondimentCost(size) + beverage.getCost();
  }
}
