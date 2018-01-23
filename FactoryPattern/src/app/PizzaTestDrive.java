package app;

import pizza.Pizza;
import stores.*;
import types.Item;
import types.Region;

import java.util.ArrayList;
import java.util.List;

public class PizzaTestDrive {
  PizzaStore pizzaStore;

  public PizzaTestDrive(Region region) {
    pizzaStore = PizzaStoreFactory.getPizzaStoreFactory(region);
  }

  public PizzaTestDrive() {}

  public void makeOrder(Region region, Item item) {
    pizzaStore = PizzaStoreFactory.getPizzaStoreFactory(region);
    pizzaStore.orderPizza(item);
}

  public static void main(String[] args) {
    PizzaTestDrive pizzaTestDrive = new PizzaTestDrive();

    System.out.println("Order 1st: ");
    pizzaTestDrive.makeOrder(Region.NY, Item.CLAMS);
    System.out.println("\nOrder 2nd: ");
    pizzaTestDrive.makeOrder(Region.CHICAGO, Item.VEGGIE);
    System.out.println("\nOrder 3rd: ");
    pizzaTestDrive.makeOrder(Region.CALIFORNIA, Item.PEPPERONI);
  }
}
