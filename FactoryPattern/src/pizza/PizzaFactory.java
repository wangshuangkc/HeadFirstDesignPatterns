package pizza;

import ingredients.factories.PizzaIngredientFactory;
import types.Item;

public class PizzaFactory {
  public static Pizza createPizza(Item item, PizzaIngredientFactory pizzaIngredientFactory) {
    switch(item) {
      case CHEESE: return new CheesePizza(pizzaIngredientFactory);
      case CLAMS: return new ClamsPizza(pizzaIngredientFactory);
      case PEPPERONI: return new PepperoniPizza(pizzaIngredientFactory);
      case VEGGIE: return new PepperoniPizza(pizzaIngredientFactory);
    }

    throw new IllegalArgumentException("Unknown pizza item");
  }
}
