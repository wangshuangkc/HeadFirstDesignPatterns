package listeners;

import subject.Subject;

public class StatisticsDisplay implements Listener, Display {
  private Subject weatherData;
  private double min;
  private double max;
  private double avg;

  public StatisticsDisplay(final Subject subject) {
    min = Double.MAX_VALUE;
    max = Double.MIN_VALUE;
    weatherData = subject;
    weatherData.addListener(this);
  }
  @Override
  public void display() {
    System.out.println("AVG/MAX/MIN temperature: " +
        avg + "/" + max + "/" + min + "˚F");
  }

  @Override
  public void update(double temperature, double humidity, double pressure) {
    min = Math.min(min, temperature);
    max = Math.max(max, temperature);
    avg = (max - min) / 2 + min;

    display();
  }
}
