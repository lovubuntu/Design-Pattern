/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Observer;

/**
 *
 * @author Prabhu
 */
public class WeatherStation {
    public static void line()
    {
        System.out.println("");
    }
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay    = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay        statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay          forecastDisplay   = new ForecastDisplay(weatherData);
        HeatIndexDisplay         heatIndexDisplay  = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
        line();
        weatherData.setMeasurements(81, 70, 29.2f);
        line();
        weatherData.setMeasurements(34,59,15.6f);
        line();
        weatherData.setMeasurements(78, 90, 29.2f);
    }

}
