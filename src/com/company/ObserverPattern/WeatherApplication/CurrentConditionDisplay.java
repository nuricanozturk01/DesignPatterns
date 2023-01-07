package com.company.ObserverPattern.WeatherApplication;

public class CurrentConditionDisplay implements Observer{

    private float temp;
    private float humidity;

    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.register(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;

        System.out.println("Temp: " + temp + " Humidity: " + humidity);
    }
}
