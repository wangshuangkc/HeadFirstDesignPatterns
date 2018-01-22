package ingredients.factories;

import ingredients.cheese.Cheese;
import ingredients.cheese.ReggianoCheese;
import ingredients.clams.Clams;
import ingredients.clams.FreshClams;
import ingredients.dough.Dough;
import ingredients.dough.ThinCrustDough;
import ingredients.pepperoni.Pepperoni;
import ingredients.pepperoni.SlicedPepperoni;
import ingredients.sauce.MarinaraSauce;
import ingredients.sauce.Sauce;
import ingredients.veggie.*;

import java.util.Arrays;
import java.util.List;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

  @Override
  public Dough createDough() {
    return new ThinCrustDough();
  }

  @Override
  public Sauce createSauce() {
    return new MarinaraSauce();
  }

  @Override
  public Clams createClams() {
    return new FreshClams();
  }

  @Override
  public Cheese createCheese() {
    return new ReggianoCheese();
  }

  @Override
  public List<Veggie> createVeggies() {
    return Arrays.asList(new Garlic(), new Onion(), new Mushroom(), new RedPepper());
  }

  @Override
  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }
}
