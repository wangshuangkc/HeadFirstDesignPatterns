package behaviors.quack;

/**
 * Behavior for duck squeaking
 */
public class Squeak implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("Squeak");
  }
}
