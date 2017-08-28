package subject;

import listeners.Listener;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
  private List<Listener> listeners;
  private double temperature;
  private double pressure;
  private double humidity;

  private static final double DEFAULT_CHANGE_RATE = 0.05;

  public WeatherData() {
    listeners = new ArrayList<>();
    temperature = 0;
    pressure = 0;
    humidity = 0;
  }

  @Override
  public void addListener(final Listener listener) {
    listeners.add(listener);
  }

  @Override
  public void removeListener(final Listener listener) {
    if (listeners.contains(listener)) {
      listeners.remove(listener);
    }
  }

  @Override
  public void notifyListeners() {
    listeners.forEach(listener -> listener.update(temperature, humidity, pressure));
  }

  public double getTemperature() {
    return temperature;
  }

  public double getPressure() {
    return pressure;
  }

  public double getHumidity() {
    return humidity;
  }

  public void measurementsChanged() {
    notifyListeners();
  }

  public void setMeasurements(double temperature, double humidity, double pressure) {
    if (readyToChange(temperature, humidity, pressure)) {
      this.temperature = temperature;
      this.humidity = humidity;
      this.pressure = pressure;
      measurementsChanged();
    }
  }

  private boolean readyToChange(double temperature, double humidity, double pressure) {
    return Math.abs((temperature - this.temperature) / this.temperature) >= DEFAULT_CHANGE_RATE ||
        Math.abs((humidity - this.humidity) / this.humidity) >= DEFAULT_CHANGE_RATE ||
        Math.abs((pressure - this.pressure) / this.pressure) >= DEFAULT_CHANGE_RATE;
  }
}
