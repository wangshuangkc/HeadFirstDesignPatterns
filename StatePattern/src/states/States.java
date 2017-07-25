package states;

/**
 * State constants
 */
public enum States {
  NO_QUATER("No Quarter"),
  HAS_QUATER("Quater inserted"),
  SOLD("Gumball sold"),
  EMPTY("Out of gumball"),
  WINNER("Win an extra gumball");

  private String value;

  States(final String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}
