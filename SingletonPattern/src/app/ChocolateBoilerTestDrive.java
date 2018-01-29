package app;

import exceptions.InvalidActionForStateException;
import singleton.ChocolateBoiler;

public class ChocolateBoilerTestDrive {

  public static void main(String[] args) {
    ChocolateBoilerTestThread thread1 = new ChocolateBoilerTestThread("thread1");
    ChocolateBoilerTestThread thread2 = new ChocolateBoilerTestThread("thread2");

    try {
      thread1.start();
      thread2.start();
    } catch (InterruptedException e) {
      System.out.println(e.getMessage());
    }
  }

  static class ChocolateBoilerTestThread implements Runnable {

    private Thread thread;
    private String name;
    private static final long WAIT_TIME = 1000;

    ChocolateBoilerTestThread(String name) {
      this.name = name;
    }
    public void start() throws InterruptedException {
      thread = new Thread(this, name);
      thread.start();
    }

    @Override
    public void run() {
      ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();

      try {
        System.out.println("Thread " + name + " is running.");
        Thread.sleep(WAIT_TIME);
        chocolateBoiler.fill();
        Thread.sleep(WAIT_TIME);
        chocolateBoiler.boil();
        Thread.sleep(WAIT_TIME);
        chocolateBoiler.drain();
      } catch (InterruptedException e) {
        System.out.println("Thread " + name + " is interrupted.");
      } catch (InvalidActionForStateException e) {
        System.out.println(e.getMessage());
      }
    }
  }
}
