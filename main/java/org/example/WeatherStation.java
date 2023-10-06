package org.example;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class WeatherStation extends Observable {
    private float currentTemperature;
    private float currentPressure;
    private float currentHumidity;
    private ArrayList<Observer> observers;
    public float getCurrentTemperature() {
        return currentTemperature;
    }

    public float getCurrentPressure() {
        return currentPressure;
    }

    public float getCurrentHumidity() {
        return currentHumidity;
    }

    public WeatherStation(){
        observers=new ArrayList<Observer>();
    }
    public void update(float tempTemperature,float tempPressure,float tempHumidity){
        this.currentTemperature=currentTemperature;
        this.currentPressure=currentPressure;
        this.currentHumidity=currentHumidity;
    }
    //需要注意  java 内置观察者 需要调用setChanged方法
    public void dataChange(){
        setChanged();
        notifyObservers(new Data(getCurrentTemperature(),getCurrentPressure(),getCurrentHumidity()));
    }


    public void setData(float tempTemperature, float tempPressure, float tempHumidity){
        this.currentTemperature=tempTemperature;
        this.currentPressure=tempPressure;
        this.currentHumidity=tempHumidity;
        dataChange();
    }
    //载体类，放更新数据
    public class Data{
        private float currentTemperature;
        private float currentPressure;
        private float currentHumidity;
        public Data(float currentTemperature, float currentPressure, float currentHumidity) {
            this.currentTemperature = currentTemperature;
            this.currentPressure = currentPressure;
            this.currentHumidity = currentHumidity;
        }
        public float getCurrentTemperature() {
            return currentTemperature;
        }
        public float getCurrentPressure() {
            return currentPressure;
        }

        public float getCurrentHumidity() {
            return currentHumidity;
        }
    }

}
