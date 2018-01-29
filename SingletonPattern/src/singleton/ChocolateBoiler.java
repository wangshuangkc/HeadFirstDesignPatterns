package singleton;

import boilderstates.BoilerEmptyState;
import boilderstates.BoilerState;

public class ChocolateBoiler {
  private volatile static ChocolateBoiler chocolateBoiler;
  private BoilerState state;

  private ChocolateBoiler() {
    state = new BoilerEmptyState(this);
  }

  public static ChocolateBoiler getInstance() {
    if (chocolateBoiler == null) {
      synchronized (ChocolateBoiler.class) {
        if (chocolateBoiler == null) {
          chocolateBoiler = new ChocolateBoiler();
        }
      }
    }

    return chocolateBoiler;
  }

  public void fill() {
    state.fill();
  }

  public void drain() {
    state.drain();
  }

  public void boil() {
    state.boil();
  }

  public BoilerState getState() {
    return state;
  }

  public void setState(BoilerState state) {
    this.state = state;
  }
}
