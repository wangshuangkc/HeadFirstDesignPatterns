package proxy;

import gumball.context.GumballMachine;

import java.rmi.Naming;
import java.rmi.RemoteException;

public class GumballMachineTestDrive {

  public static void main(String[] args) {
    GumballMachineRemote gumballMachine = null;
    if (args.length < 2) {
      System.out.println("GumballMachine <name> <inventory>");
      System.exit(1);
    }

    try {
      String location = args[0];
      int count = Integer.parseInt(args[1]);
      gumballMachine = new GumballMachine(location, count);
      // publish the stub under the name
      Naming.rebind("//" + location + "/gumballmachine", gumballMachine);
    } catch (Exception e) {
      System.out.println("Failed to access remote gumball machine. \n" + e.getStackTrace());
    }
  }
}
