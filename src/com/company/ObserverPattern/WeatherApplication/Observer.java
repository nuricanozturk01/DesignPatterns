package com.company.ObserverPattern.WeatherApplication;

public interface Observer
{
    void update(float temp, float humidity, float pressure);
}
