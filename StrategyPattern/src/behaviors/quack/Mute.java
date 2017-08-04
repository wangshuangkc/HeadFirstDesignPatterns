package behaviors.quack;

/**
 * Behavior for duck cannot quack
 */
public class Mute implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("<Silence>");
  }
}
