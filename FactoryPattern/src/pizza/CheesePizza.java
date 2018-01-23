package pizza;

import ingredients.factories.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
  private PizzaIngredientFactory pizzaIngredientFactory;

  public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
    this.pizzaIngredientFactory = pizzaIngredientFactory;
    name = "Cheese Pizza";
  }

  @Override
  public void prepare() {
    dough = pizzaIngredientFactory.createDough();
    sauce = pizzaIngredientFactory.createSauce();
    cheese = pizzaIngredientFactory.createCheese();
  }

  @Override
  public String toString() {
    return String.format("%s\n%s, %s, %s", name, dough.getDough(), sauce.getSauce(), cheese.getCheese());
  }
}
