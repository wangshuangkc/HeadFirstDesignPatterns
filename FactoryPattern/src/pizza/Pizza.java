package pizza;

import ingredients.cheese.Cheese;
import ingredients.clams.Clams;
import ingredients.dough.Dough;
import ingredients.pepperoni.Pepperoni;
import ingredients.sauce.Sauce;
import ingredients.veggie.Veggie;

import java.util.List;

public abstract class Pizza {
  String name;
  Dough dough;
  Sauce sauce;
  Cheese cheese;
  Clams clams;
  List<Veggie> veggies;
  Pepperoni pepperoni;

  public abstract void prepare();

  public void bake() {
    System.out.println("Baking for 25 min at 350F");
  }

  public void cut() {
    System.out.println("Cutting the pizza into diagonal slices");
  }

  public void box() {
    System.out.println("Placing the pizza in official box");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public abstract String toString();
}
