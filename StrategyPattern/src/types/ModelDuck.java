package types;

import behaviors.fly.FlyRocketPowered;
import behaviors.quack.Mute;

/**
 * Model duck that can fly powered by rocket, and cannot quack
 */
public class ModelDuck extends Duck {

  public ModelDuck() {
    setFlyBehavior(new FlyRocketPowered());
    setQuackBehavior(new Mute());
  }

  @Override
  public void display() {
    System.out.println("I am a model duck.");
  }
}
