package gumball.states;

import java.io.*;

/**
 * State with GumballMachine behaviors
 * extend Serializable: give it ability tobe transferred over the network
 */
public interface State extends Serializable {
	public void insertQuarter();
	public void ejectQuarter();
	public void turnCrank();
	public void dispense();
}
