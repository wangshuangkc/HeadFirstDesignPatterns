package listeners;

import subject.Subject;

public class CurrentConditionsDisplay implements Listener, Display {
  private Subject weatherData;
  private double temperature;
  private double humidity;

  public CurrentConditionsDisplay(final Subject subject) {
    this.weatherData = subject;
    weatherData.addListener(this);
  }

  @Override
  public void display() {
    System.out.println("Current conditions: " +
        temperature + "˚F and " + humidity + "% humidity");
  }

  @Override
  public void update(double temperature, double humidity, double pressure) {
    this.temperature = temperature;
    this.humidity = humidity;

    display();
  }
}
