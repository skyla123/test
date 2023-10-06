package org.example;

import javax.security.auth.Subject;
import java.util.Observable;
import java.util.Observer;

public class HeatIndexDisplay implements Observer {
    float heatIndex = 0.0f;
    public HeatIndexDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    private double computeHeatIndex(float t, float rh) {
        double index = 16.923 +1.85212*10-1 *t +5.37941* rh*1.00254 *10-1*t*rh+9.41695*103*t+ 7.28898*103 *rh+
                3.45372*10-4+1.02102*10-5 *t* rh*t*rh - 8.14971 * 10-t*rh*3.8646*105*t+2.91583 *10-5 *rh+1.42721*106*rh
                +1.97483*10-7*t*rh- 2.18429*10-8;
        return index;
    }
    public void display() {
        System.out.println("炎热指数(Heat index)为： " + heatIndex);
    }
    @Override
    public void update(Observable o, Object arg) {
        heatIndex = computeHeatIndex(t, rh);
        display();
    }
}
