package beverage.condiments;

import beverage.Beverage;
import beverage.Size;

public abstract class Condiment extends Beverage {
  protected Beverage beverage;
  protected double tallCost;
  protected double granteCost;
  protected double ventiCost;

  protected double getCondimentCost(Size size) {
    switch (size) {
      case TALL: return tallCost;
      case GRANTE: return granteCost;
      case VENTI: return ventiCost;
      default: return granteCost;
    }
  }
}
