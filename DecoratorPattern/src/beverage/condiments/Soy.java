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
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + DESCRIPTION;
  }

  @Override
  public double getCost() {
    switch (size) {
      case TALL: return TALL_COST;
      case GRANTE: return GRANTE_COST;
      case VENTI: return VENTI_COST;
      default: return GRANTE_COST;
    }
  }
}
