package stores;

import ingredients.factories.PizzaIngredientFactory;
import pizza.Pizza;
import pizza.PizzaFactory;
import types.Item;
import types.Region;

public abstract class PizzaStore {
  private Pizza pizza;
  protected PizzaIngredientFactory pizzaIngredientFactory;
  protected Region region;

  public Pizza createPizza(Item item) {
    pizza = PizzaFactory.createPizza(item, pizzaIngredientFactory);
    pizza.setName(region.toString() + " " + pizza.getName());

    return pizza;
  }

  public void orderPizza(Item item) {
    pizza = createPizza(item);

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
  }
}
