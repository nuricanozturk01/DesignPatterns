package com.company.ObserverPattern.WeatherApplication;

public class ForecastDisplay implements Observer{

    private float temp;
    private float humidity;

    private float pressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.register(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        System.out.println("Temp: " + temp + " Humidity: " + humidity + " Pressure: " + pressure);
    }
}
