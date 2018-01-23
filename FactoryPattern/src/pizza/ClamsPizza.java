package pizza;

import ingredients.factories.PizzaIngredientFactory;

public class ClamsPizza extends Pizza {
  private PizzaIngredientFactory pizzaIngredientFactory;

  public ClamsPizza(PizzaIngredientFactory pizzaIngredientFactory) {
    this.pizzaIngredientFactory = pizzaIngredientFactory;
    name = "Clams Pizza";
  }

  @Override
  public void prepare() {
    dough = pizzaIngredientFactory.createDough();
    sauce = pizzaIngredientFactory.createSauce();
    cheese = pizzaIngredientFactory.createCheese();
    clams = pizzaIngredientFactory.createClams();
  }

  @Override
  public String toString() {
    return String.format("%s\n%s, %s, %s\n%s",
        name,
        dough.getDough(), sauce.getSauce(), cheese.getCheese(),
        clams.getClam());
  }
}
