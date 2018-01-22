package pizza;

import ingredients.factories.PizzaIngredientFactory;
import ingredients.veggie.Veggie;

import java.util.List;
import java.util.stream.Collectors;

public class VeggiePizza extends Pizza {
  private PizzaIngredientFactory pizzaIngredientFactory;

  public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
    this.pizzaIngredientFactory = pizzaIngredientFactory;
    name = "Veggie Pizza";
  }

  @Override
  public void prepare() {
    dough = pizzaIngredientFactory.createDough();
    sauce = pizzaIngredientFactory.createSauce();
    cheese = pizzaIngredientFactory.createCheese();
    veggies = pizzaIngredientFactory.createVeggies();
  }

  @Override
  public String toString() {
    List<String> veggieNames = veggies.stream().map(Veggie::getVeggie).collect(Collectors.toList());
    return String.format("%d\n%d, %d, %d\n%d",
        name,
        dough.getDough(), sauce.getSauce(), cheese.getCheese(),
        String.join(", ", veggieNames));
  }
}
