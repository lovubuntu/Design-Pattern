/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Observer;

import java.util.ArrayList;
/**
 *
 * @author Prabhu
 */
public class WeatherData implements Subject{

    private ArrayList observers;
    private float temperature,humidity,pressure;

    public WeatherData()
    {
        observers = new ArrayList();
    }
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        if(index >= 0 )
        {
            observers.remove(index);
        }
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }
    public void measurementsChanged()
    {
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity,float pressure)
    {
        this.temperature    =   temperature;
        this.pressure       =   pressure;
        this.humidity       =   humidity;
        measurementsChanged();
    }
}
