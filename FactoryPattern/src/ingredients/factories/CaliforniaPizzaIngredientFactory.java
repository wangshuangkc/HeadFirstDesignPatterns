package ingredients.factories;

import ingredients.cheese.Cheese;
import ingredients.cheese.GoatCheese;
import ingredients.clams.Camari;
import ingredients.clams.Clams;
import ingredients.dough.Dough;
import ingredients.dough.VeryThinCrustDough;
import ingredients.pepperoni.Pepperoni;
import ingredients.pepperoni.StandardPepperoni;
import ingredients.sauce.Bruschetta;
import ingredients.sauce.Sauce;
import ingredients.veggie.*;
import types.Region;

import java.util.Arrays;
import java.util.List;

public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory {

  @Override
  public Region getRegion() {
    return Region.CALIFORNIA;
  }

  @Override
  public Dough createDough() {
    return new VeryThinCrustDough();
  }

  @Override
  public Sauce createSauce() {
    return new Bruschetta();
  }

  @Override
  public Clams createClams() {
    return new Camari();
  }

  @Override
  public Cheese createCheese() {
    return new GoatCheese();
  }

  @Override
  public List<Veggie> createVeggies() {
    return Arrays.asList(new Avocado(), new Potato(), new ArtichokeHearts(), new Garlic());
  }

  @Override
  public Pepperoni createPepperoni() {
    return new StandardPepperoni();
  }
}
