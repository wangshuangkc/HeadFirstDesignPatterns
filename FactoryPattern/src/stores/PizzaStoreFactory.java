package stores;

import types.Region;

public class PizzaStoreFactory {
  public static PizzaStore createPizzaStoreFactory(Region region) {
    switch (region) {
      case NY: return new NYPizzaStore();
      case CHICAGO: return new ChicagoPizzaStore();
      case CALIFORNIA: return new CaliforniaPizzaStore();
      default: throw new IllegalArgumentException("Unknown region");
    }
  }
}
