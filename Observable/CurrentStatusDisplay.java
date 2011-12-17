/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Observable;

import java.util.Observable;
import java.util.Observer;
/**
 *
 * @author Prabhu
 */
public class CurrentStatusDisplay implements Observer,DisplayElement{
    private float       temperature,humidity;
    private WeatherData weatherData;

    public CurrentStatusDisplay(Observable observable)
    {
        observable.addObserver(this);
    }

    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherData)
        {
            this.weatherData    =   (WeatherData) obs;
            temperature         =   weatherData.getTemperature();
            humidity            =   weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println("Current Statistics: Temperature = "
                +temperature+" Humidity = "+humidity);
    }
}
