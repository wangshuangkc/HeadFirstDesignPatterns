package ingredients.factories;

import ingredients.cheese.Cheese;
import ingredients.clams.Clams;
import ingredients.dough.Dough;
import ingredients.pepperoni.Pepperoni;
import ingredients.sauce.Sauce;
import ingredients.veggie.Veggie;
import types.Region;

import java.util.List;

public interface PizzaIngredientFactory {

  public Region getRegion();
  public Dough createDough();
  public Sauce createSauce();
  public Clams createClams();
  public Cheese createCheese();
  public List<Veggie> createVeggies();
  public Pepperoni createPepperoni();
}
