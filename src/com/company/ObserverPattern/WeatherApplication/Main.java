package com.company.ObserverPattern.WeatherApplication;

public class Main
{
    public static void main(String[] args) {
        var weatherData = new WeatherData();
        var currentDisplay = new CurrentConditionDisplay(weatherData);
        var forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(10,43,64);
        weatherData.setMeasurements(23,52,64);
    }
}
