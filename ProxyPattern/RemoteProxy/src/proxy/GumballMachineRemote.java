package proxy;

import gumball.states.State;

import java.rmi.Remote;

public interface GumballMachineRemote extends Remote {
  public int getCount();
  public State getState();
  public String getLocation();
}
