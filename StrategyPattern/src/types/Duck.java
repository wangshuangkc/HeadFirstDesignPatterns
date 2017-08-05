package types;

import behaviors.fly.FlyBehavior;
import behaviors.quack.QuackBehavior;

/**
 * Duck with behaviors
 */
public abstract class Duck {

  private FlyBehavior flyBehavior;
  private QuackBehavior quackBehavior;

  public void swim() {
    System.out.println("Swimming...");
  }

  public void performFly() {
    flyBehavior.fly();
  }

  public void perfomQuack() {
    quackBehavior.quack();
  }

  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }

  public abstract void display();
}
