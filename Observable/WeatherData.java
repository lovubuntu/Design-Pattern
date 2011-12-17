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
public class WeatherData extends Observable{
    private float temperature,pressure,humidity;
    public WeatherData()
    {

    }
    public float getTemperature()
    {
        return temperature;
    }
    public float getPressure()
    {
        return pressure;
    }
    public float getHumidity()
    {
        return humidity;
    }
    public void setMeasurements(float temperature,float pressure,float humidity)
    {
        this.temperature    =   temperature;
        this.pressure       =   pressure;
        this.humidity       =   humidity;
        measurementsChanged();
    }
    public void measurementsChanged()
    {
        setChanged();
        notifyObservers();
    }
}
