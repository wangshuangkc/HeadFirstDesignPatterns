package stores;

import ingredients.factories.CaliforniaPizzaIngredientFactory;
import types.Region;

public class CaliforniaPizzaStore extends PizzaStore {

  public CaliforniaPizzaStore() {
    pizzaIngredientFactory = new CaliforniaPizzaIngredientFactory();
    region = Region.CALIFORNIA;
  }
}
