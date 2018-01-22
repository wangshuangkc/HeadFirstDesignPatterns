package types;

public enum Item {
  CHEESE("Cheese Pizza"),
  CLAMS("Clams Pizza"),
  PEPPERONI("Pepperoni Pizza"),
  VEGGIE("Veggie Pizza");

  private String item;

  Item(String item) {
    this.item = item;
  }

  @Override
  public String toString() {
    return item;
  }
}
