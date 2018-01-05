package beverage;

/**
 * Behaviors for a beverage
 */
public abstract class Beverage {

  protected Size size;
  protected String description = "Beverage";

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
  public abstract double getCost();

  /**
   * Set the size of the beverage
   * @param size Tall, Grante or Venti
   */
  public void setSize(Size size){
    this.size = size;
  }

  /**
   * Get the size of the beverage
   * @return Tall, Grante or Venti
   */
  public Size getSize() {
    return size;
  }
}
