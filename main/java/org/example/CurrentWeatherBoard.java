package org.example;

import java.util.Observable;
import java.util.Observer;

public class CurrentWeatherBoard implements Observer {
    private float currentTemperature;
    private float currentPressure;
    private float currentHumidity;
    public void display(){
        System.out.println("Now currentTemperature:"+currentTemperature);
        System.out.println("Now currentPressure:"+currentPressure);
        System.out.println("Now currentHumidity:"+currentHumidity);}

    /**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     *            method.
     */
    @Override
    public void update(Observable o, Object arg) {
            this.currentTemperature=((WeatherStation.Data)arg).getCurrentTemperature();
            this.currentPressure=((WeatherStation.Data)arg).getCurrentTemperature();
            this.currentHumidity=((WeatherStation.Data)arg).getCurrentPressure();
            display();

    }
}
