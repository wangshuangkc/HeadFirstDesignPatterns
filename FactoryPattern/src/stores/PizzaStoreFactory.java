package stores;

import types.Region;

public class PizzaStoreFactory {

  static PizzaStore nyPizzaStore = new NYPizzaStore();
  static PizzaStore chiPizzaStore = new ChicagoPizzaStore();
  static PizzaStore caPizzaStore = new CaliforniaPizzaStore();

  public static PizzaStore getPizzaStoreFactory(Region region) {
    switch (region) {
      case NY: return nyPizzaStore;
      case CHICAGO: return chiPizzaStore;
      case CALIFORNIA: return caPizzaStore;
      default: throw new IllegalArgumentException("Unknown region");
    }
  }
}
