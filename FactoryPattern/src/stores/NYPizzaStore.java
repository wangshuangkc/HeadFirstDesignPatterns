package stores;

import ingredients.factories.NYPizzaIngredientFactory;
import types.Region;

public class NYPizzaStore extends PizzaStore {

  public NYPizzaStore() {
    pizzaIngredientFactory = new NYPizzaIngredientFactory();
    region = Region.NY;
  }
}
