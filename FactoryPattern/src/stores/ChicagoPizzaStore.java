package stores;

import ingredients.factories.ChicagoPizzaIngredientFactory;
import types.Region;

public class ChicagoPizzaStore extends PizzaStore {

  public ChicagoPizzaStore() {
    pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
    region = Region.CHICAGO;
  }
}
