package beverage.condiments;

import beverage.Beverage;
import beverage.Size;

public class Soy extends Condiment {

  private static final String DESCRIPTION = ", Soy";
  private static final double TALL_COST = 0.1;
  private static final double GRANTE_COST = 0.15;
  private static final double VENTI_COST = 0.5;

  public Soy(Beverage beverage, Size size) {
    this.beverage = beverage;
    this.size = size;

    tallCost = TALL_COST;
    granteCost = GRANTE_COST;
    ventiCost = VENTI_COST;
  }

  public Soy(Beverage beverage) {
    new Soy(beverage, Size.GRANTE);
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
