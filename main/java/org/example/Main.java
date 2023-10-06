package org.example;

public class Main {
    public static void main(String[] args) {
        CurrentWeatherBoard currentWeatherBoard;
        StaticWeatherBoard staticWeatherData;
        WeatherStation weatherStation;

        weatherStation=new WeatherStation();
        currentWeatherBoard=new CurrentWeatherBoard();
        staticWeatherData=new StaticWeatherBoard();

        //执行顺序 最后注册的先执行代码
        weatherStation.addObserver(currentWeatherBoard);
        weatherStation.addObserver(staticWeatherData);
        weatherStation.setData(35,120,38);
        System.out.println();
        weatherStation.deleteObserver(staticWeatherData);
        weatherStation.setData(25,150,50);

    }
}