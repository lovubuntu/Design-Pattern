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
public class ForecastDisplay implements Observer,DisplayElement{
    private float lastPressure,currentPressure = 29.0f;

    public ForecastDisplay(Observable observable)
    {
        observable.addObserver(this);
    }

    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherData)
        {
            WeatherData weatherData = (WeatherData) obs;
            lastPressure    =   currentPressure;
            currentPressure =   weatherData.getPressure();
            display();
        }
    }

    public void display() {
        System.out.print("Weather Forecast:");
        if (currentPressure < lastPressure) {
            System.out.println("Expect a Rain soon");
        }
        else if(currentPressure == lastPressure) {
            System.out.println("More of the Same");
        }
        else if(currentPressure > lastPressure)
        {
            System.out.println("Weather improving by the day");
        }
    }

}
