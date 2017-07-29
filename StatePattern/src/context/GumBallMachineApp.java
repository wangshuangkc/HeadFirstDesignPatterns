package context;

import exceptions.InvalidActionForStateException;

/**
 * Main class for testing Gumball Machine
 */
public class GumBallMachineApp {
  public static void main(String[] args) {
    final GumballMachine gumballMachine = new GumballMachine();
    System.out.println(gumballMachine);
    System.out.println();

    System.out.println("Test insert-turncrank-dispense/winner");
    int times = 10;
    while (times > 0) {
      gumballMachine.insertQuater();
      gumballMachine.turnCrank();
      gumballMachine.dispense();
      System.out.println(gumballMachine);
      times--;
    }
    System.out.println();

    System.out.println("Test insert-eject-turncrank-dispense");
    gumballMachine.insertQuater();
    gumballMachine.ejectQuater();
    gumballMachine.turnCrank();
    gumballMachine.dispense();
    System.out.println(gumballMachine);
    System.out.println();

    System.out.println("Test insert-turncrank-eject-dispense");
    gumballMachine.insertQuater();
    gumballMachine.turnCrank();
    gumballMachine.ejectQuater();
    gumballMachine.dispense();
    System.out.println(gumballMachine);
    System.out.println();

    System.out.println("Test eject-turncrank-dispense");
    gumballMachine.ejectQuater();
    gumballMachine.turnCrank();
    gumballMachine.dispense();
    System.out.println(gumballMachine);
    System.out.println();

    System.out.println("Test insert-turncrank-dispense/winner-refill");
    while (gumballMachine.getCnt() > 0) {
      gumballMachine.insertQuater();
      gumballMachine.turnCrank();
      gumballMachine.dispense();
    }
    gumballMachine.insertQuater();
    gumballMachine.turnCrank();
    gumballMachine.ejectQuater();
    gumballMachine.dispense();
    System.out.println(gumballMachine);
    System.out.println();

    gumballMachine.refill(5);
    System.out.println(gumballMachine);
    gumballMachine.refill(10);
    System.out.println(gumballMachine);
    gumballMachine.refill(15);
    System.out.println(gumballMachine);
    System.out.println();
  }
}
