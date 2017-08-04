package behaviors.quack;

/**
 * Behavior for duck quacking
 */
public class Quack implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("Quack!");
  }
}
