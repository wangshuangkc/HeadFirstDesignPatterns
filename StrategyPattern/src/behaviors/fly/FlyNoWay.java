package behaviors.fly;

/**
 * Behavior for duck cannot fly
 */
public class FlyNoWay implements FlyBehavior{

  @Override
  public void fly() {
    System.out.println("Cannot fly!");
  }
}
