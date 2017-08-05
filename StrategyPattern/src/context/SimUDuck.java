package context;

import types.Duck;
import types.MallardDuck;
import types.ModelDuck;
import types.RubberDuck;

import java.util.Arrays;
import java.util.List;

/**
 * Context class for duck simulator
 */
public class SimUDuck {
  public static void main(String[] args) {
    List<Duck> ducks = Arrays.asList(new MallardDuck(), new RubberDuck(), new ModelDuck());
    ducks.forEach(duck -> simulate(duck));
  }

  private static void simulate(Duck duck) {
    System.out.println("Test " + duck.getClass().getSimpleName() + ": ");
    duck.display();
    duck.swim();
    duck.performFly();
    duck.perfomQuack();
    System.out.println();
  }
}
