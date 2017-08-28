package listeners;

import subject.Subject;

public class ForecastDisplay implements Listener, Display {
  private Subject weatherData;
  private double lastPressure;
  private double currentPressure;

  private static final double DEFAULT_PRESSURE = 29.5;

  public ForecastDisplay(final Subject subject) {
    currentPressure = DEFAULT_PRESSURE;
    weatherData = subject;
    weatherData.addListener(this);
  }

  @Override
  public void display() {
    final StringBuffer sb = new StringBuffer("Forecast: ");
    if (currentPressure > lastPressure) {
      sb.append("Improving weather on the way!");
    } else if (currentPressure == lastPressure) {
      sb.append("More of the same");
    } else {
      sb.append("Watch out for cooler, rainy weather");
    }
    System.out.println(sb.toString());
  }

  @Override
  public void update(double temperature, double humidity, double pressure) {
    lastPressure = currentPressure;
    currentPressure = pressure;
    display();
  }
}
