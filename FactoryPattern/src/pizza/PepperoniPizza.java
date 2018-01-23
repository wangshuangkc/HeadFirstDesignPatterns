package pizza;

import ingredients.factories.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {
  private PizzaIngredientFactory pizzaIngredientFactory;

  public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
    this.pizzaIngredientFactory = pizzaIngredientFactory;
    name = "Pepperoni Pizza";
  }

  @Override
  public void prepare() {
    dough = pizzaIngredientFactory.createDough();
    sauce = pizzaIngredientFactory.createSauce();
    cheese = pizzaIngredientFactory.createCheese();
    pepperoni = pizzaIngredientFactory.createPepperoni();
  }

  @Override
  public String toString() {
    return String.format("%s\n%s, %s, %s\n%s",
        name,
        dough.getDough(), sauce.getSauce(), cheese.getCheese(),
        pepperoni.getPepperoni());
  }
}
