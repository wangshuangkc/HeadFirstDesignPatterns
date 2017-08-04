package types;

import behaviors.fly.FlyNoWay;
import behaviors.quack.Squeak;

/**
 * Rubber duck that cannot fly, and can squeak
 */
public class RubberDuck extends Duck {

  public RubberDuck() {
    setFlyBehavior(new FlyNoWay());
    setQuackBehavior(new Squeak());
  }

  @Override
  public void display() {
    System.out.println("I am a rubber duck.");
  }
}
