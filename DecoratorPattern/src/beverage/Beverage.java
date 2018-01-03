package beverage;

/**
 * Behaviors for a beverage
 */
public abstract class Beverage {

  protected String description;
  protected double cost;

  /**
   * Get the description of the beverage
   * @return descriptions String
   */
  public String getDescription() {
    return description;
  }

  /**
   * Get the cost of the beverage
   * @return cost as double
   */
  public double getCost(){
    return cost;
  }
}
