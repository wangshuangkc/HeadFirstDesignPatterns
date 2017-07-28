package exceptions;

/**
 * Thrown when the action is not allowed for the current state
 */
public class InvalidActionForStateException extends RuntimeException {
  public InvalidActionForStateException() {
    super();
  }

  public InvalidActionForStateException(final String msg) {
    super(msg);
  }
}
