package org.example;

import java.util.Observable;
import java.util.Observer;

public class StaticWeatherBoard implements Observer {
    private float currentTemperature;
    private float currentPressure;
    private float currentHumidity;

    private float aveValue;

    public void display(){
        System.out.println("Ave Value:"+aveValue);
    }
    @Override
    public void update(Observable o, Object arg) {
        aveValue=aveValue=(((WeatherStation.Data)arg).getCurrentTemperature()+((WeatherStation.Data)arg).getCurrentTemperature()+((WeatherStation.Data)arg).getCurrentPressure())/3;
        display();
    }
}
