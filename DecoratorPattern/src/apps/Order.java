package apps;

import beverage.Beverage;
import beverage.Size;
import beverage.condiments.Milk;
import beverage.condiments.Mocha;
import beverage.condiments.Soy;
import beverage.condiments.Whip;

import java.util.ArrayList;
import java.util.List;

public class Order {
  private Beverage beverage;

  public Order(Beverage beverage) {
    this.beverage = beverage;
  }

  public void addMilk(Size size) {
    beverage = new Milk(beverage, size);
  }

  public void addMocha(Size size) {
    beverage = new Mocha(beverage, size);
  }

  public void addSoy(Size size) {
    beverage = new Soy(beverage, size);
  }

  public void addWhip(Size size) {
    beverage = new Whip(beverage, size);
  }

  public Beverage getBeverage() {
     return beverage;
  }

  public String printBeverage() {
    return beverage.getDescription() + ": $ " + beverage.getCost();
  }
}
