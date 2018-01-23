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

  private Pizza createPizza(Item item) {
    pizza = PizzaFactory.createPizza(item, pizzaIngredientFactory);
    pizza.setName(region.toString() + " " + pizza.getName());

    return pizza;
  }

  public void orderPizza(Item item) {
    pizza = createPizza(item);

    pizza.prepare();
    System.out.println("Prepare " + pizza.toString());

    pizza.bake();
    pizza.cut();
    pizza.box();
  }
}
