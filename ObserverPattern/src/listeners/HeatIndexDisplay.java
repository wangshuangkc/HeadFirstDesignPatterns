package listeners;

import subject.Subject;

public class HeatIndexDisplay implements Listener, Display {
  private Subject weatherData;
  private double heatIndex;

  public HeatIndexDisplay(final Subject subject) {
    heatIndex = 0;
    weatherData = subject;
    weatherData.addListener(this);
  }

  @Override
  public void display() {
    System.out.println("Heat index: " + String.format("%.4f", heatIndex));
  }

  @Override
  public void update(double temperature, double humidity, double pressure) {
    heatIndex = calHeatIndex(temperature, humidity);
    display();
  }

  private double calHeatIndex(double t, double rh) {
     return ((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh)
        + (0.00941695 * (t * t)) + (0.00728898 * (rh * rh))
        + (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
        (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
        (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
        (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
        0.000000000843296 * (t * t * rh * rh * rh)) -
        (0.0000000000481975 * (t * t * t * rh * rh * rh)));
  }
}
