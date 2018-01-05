package apps;

import beverage.Size;
import beverage.coffee.DarkRoast;
import beverage.coffee.Espresso;
import beverage.coffee.HouseBlend;

import java.util.ArrayList;
import java.util.List;

public class Stubuzz {
  private static final Size defaultSize = Size.GRANTE;
  private List<Order> orders = new ArrayList<>();

  public void addOrder(Order order) {
    orders.add(order);
  }

  public void checkout() {
    double total = 0;
    for (Order order : orders) {
      total += order.getBeverage().getCost();
      System.out.println(order.printBeverage());
    }
    System.out.println("Total: $" + total);
    orders.clear();
  }

  public static void main(String[] args) {
    Stubuzz stubuzz = new Stubuzz();

    Order order = new Order(new Espresso());
    stubuzz.addOrder(order);

    Order order1 = new Order(new DarkRoast());
    order1.addMocha(defaultSize);
    order1.addMocha(defaultSize);
    order1.addWhip(defaultSize);
    stubuzz.addOrder(order1);

    Order order2 = new Order(new HouseBlend());
    order2.addSoy(defaultSize);
    order2.addMocha(defaultSize);
    order2.addWhip(defaultSize);
    stubuzz.addOrder(order2);

    stubuzz.checkout();
  }
}
