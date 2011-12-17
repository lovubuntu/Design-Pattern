/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Observable;

/**
 *
 * @author Prabhu
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData =   new WeatherData();
        weatherData.setMeasurements(80.0f, 45.0f, 30.0f);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        CurrentStatusDisplay currentStatusDisplay = new CurrentStatusDisplay(weatherData);

        weatherData.setMeasurements(80.0f, 45.0f, 30.0f);
        weatherData.setMeasurements(70.0f, 35.0f, 20.0f);
        weatherData.setMeasurements(90.0f, 55.0f, 40.0f);

    }

}
