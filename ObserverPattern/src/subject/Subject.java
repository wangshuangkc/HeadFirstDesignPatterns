package subject;

import listeners.Listener;

public interface Subject {
  public void addListener(Listener listener);
  public void removeListener(Listener listener);
  public void notifyListeners();
}
