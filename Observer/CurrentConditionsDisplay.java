/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Observer;

/**
 *
 * @author Prabhu
 */
public class CurrentConditionsDisplay implements Observer,DisplayInterface{

    private float temperature;
    private float humidity;
    private WeatherData weatherData;
    public CurrentConditionsDisplay(WeatherData weatherData)
    {
        this.weatherData    =   weatherData;
        weatherData.registerObserver(this);
    }
    public void update(float temperature, float humidity, float pressure) {
        this.temperature    =   temperature;
        this.humidity       =   humidity;
        display();
    }

    public void display() {
        System.out.println("Temperature = "+temperature+" Humidity = "+humidity);
    }

}
