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
public class StatisticsDisplay implements Observer,DisplayElement{
    private float minTemp = 200.0f,maxTemp = 0.0f ,sumTemp,numReadings;

    public StatisticsDisplay(Observable observable)
    {
        observable.addObserver(this);
    }

    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherData)
        {
            WeatherData weatherData = (WeatherData) obs;
            float temp              = weatherData.getTemperature();
            numReadings++;
            sumTemp +=  temp;
            if (temp>maxTemp) {
                maxTemp =   temp;
            }
            if(temp<minTemp) {
                minTemp =   temp;
            }
            display();
        }
    }

    public void display() {
        System.out.println("Statistics Display: Avg/Max/Min"+
                (sumTemp/numReadings)+"/"+maxTemp+"/"+minTemp);
    }

}
