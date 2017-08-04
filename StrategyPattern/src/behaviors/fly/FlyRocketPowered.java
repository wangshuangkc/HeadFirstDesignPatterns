package behaviors.fly;

/**
 * Behavior for duck flying with rocket power
 */
public class FlyRocketPowered implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("Fly powered by rocket!");
  }
}
