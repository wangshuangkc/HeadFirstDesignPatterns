package singleton;

import boilderstates.BoilerEmptyState;
import boilderstates.BoilerState;

public class ChocolateBoiler {
  private volatile static ChocolateBoiler chocolateBoiler;
  private volatile BoilerState state;

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

  //Todo why synchronized is required with volatile variables if multithread starts together
  public synchronized void fill() {
    state.fill();
  }

  public synchronized void drain() {
    state.drain();
  }

  public synchronized void boil() {
    state.boil();
  }

  public BoilerState getState() {
    return state;
  }

  public void setState(BoilerState state) {
    this.state = state;
  }
}
