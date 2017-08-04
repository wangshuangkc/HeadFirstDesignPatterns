package types;

import behaviors.fly.FlyWithWings;
import behaviors.quack.Quack;

/**
 * Mallard duck that can fly with wings and quack
 */
public class MallardDuck extends Duck {

  public MallardDuck() {
    setFlyBehavior(new FlyWithWings());
    setQuackBehavior(new Quack());
  }

  @Override
  public void display() {
    System.out.println("I am a Mallard duck");
  }
}
