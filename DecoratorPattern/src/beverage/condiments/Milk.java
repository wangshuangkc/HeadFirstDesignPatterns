package beverage.condiments;

import beverage.Beverage;
import beverage.Size;

public class Milk extends Condiment {

  private static final String DESCRIPTION = ", Steamed milk";
  private static final double TALL_COST = 0.05;
  private static final double GRANTE_COST = 0.1;
  private static final double VENTI_COST = 0.15;

  public Milk(Beverage beverage, Size size) {
    this.beverage = beverage;
    this.size = size;

    tallCost = TALL_COST;
    granteCost = GRANTE_COST;
    ventiCost = VENTI_COST;
  }

  public Milk(Beverage beverage) {
    new Milk(beverage, Size.GRANTE);
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
