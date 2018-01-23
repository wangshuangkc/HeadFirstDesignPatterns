package ingredients.factories;

import ingredients.cheese.Cheese;
import ingredients.cheese.MozzarellaCheese;
import ingredients.clams.Clams;
import ingredients.clams.FrozenClams;
import ingredients.dough.Dough;
import ingredients.dough.ThickCrustDough;
import ingredients.pepperoni.Pepperoni;
import ingredients.pepperoni.SlicedPepperoni;
import ingredients.sauce.PlumTomatoSauce;
import ingredients.sauce.Sauce;
import ingredients.veggie.*;
import types.Region;

import java.util.Arrays;
import java.util.List;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

  @Override
  public Region getRegion() {
    return Region.CHICAGO;
  }

  @Override
  public Dough createDough() {
    return new ThickCrustDough();
  }

  @Override
  public Sauce createSauce() {
    return new PlumTomatoSauce();
  }

  @Override
  public Clams createClams() {
    return new FrozenClams();
  }

  @Override
  public Cheese createCheese() {
    return new MozzarellaCheese();
  }

  @Override
  public List<Veggie> createVeggies() {
    return Arrays.asList(new Eggplant(), new BlackOlives(), new Spinach());
  }

  @Override
  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }
}
