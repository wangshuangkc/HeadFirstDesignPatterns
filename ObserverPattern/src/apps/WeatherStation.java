package apps;

import listeners.*;
import subject.WeatherData;

public class WeatherStation {
  public static void main(String[] args) {
    final WeatherData weatherData = new WeatherData();

    final Listener currentConditionsListener = new CurrentConditionsDisplay(weatherData);
    final Listener statisticsListener = new StatisticsDisplay(weatherData);
    final Listener forecastListener = new ForecastDisplay(weatherData);
    final Listener heatIndexListener = new HeatIndexDisplay(weatherData);

    weatherData.setMeasurements(80, 65, 30.4);
    System.out.println();
    weatherData.setMeasurements(82, 70, 29.2);
    System.out.println();
    weatherData.setMeasurements(78, 90, 29.2);
    System.out.println();
  }
}
