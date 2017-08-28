package listeners;

import subject.Subject;

public class StatisticsDisplay implements Listener, Display {
  private Subject weatherData;
  private double min;
  private double max;
  private int numReadings;
  private double tempSum;

  public StatisticsDisplay(final Subject subject) {
    min = Double.MAX_VALUE;
    max = Double.MIN_VALUE;
    numReadings = 0;
    tempSum = 0;
    weatherData = subject;
    weatherData.addListener(this);
  }
  @Override
  public void display() {
    System.out.println("AVG/MAX/MIN temperature: " +
        tempSum / numReadings + "/" + max + "/" + min + "˚F");
  }

  @Override
  public void update(double temperature, double humidity, double pressure) {
    min = Math.min(min, temperature);
    max = Math.max(max, temperature);
    tempSum += temperature;
    numReadings++;

    display();
  }
}
