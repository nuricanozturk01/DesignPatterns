package com.company.ObserverPattern.WeatherApplication;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject //observable
{
    private final List<Observer> observers;
    private float humidity;
    private float temperature;
    private float pressure;

    public WeatherData()
    {
        this.observers = new ArrayList<>();
    }

    public void setMeasurements(float humidity, float temperature, float pressure) {
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;
        measurementChanged();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer)
    {
        var idx = observers.indexOf(observer);

        if (idx >= 0)
            observers.remove(idx);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(this::update);
    }

    public void measurementChanged() {
        notifyObservers();
    }
    private void update(Observer observer) {
        observer.update(temperature, humidity, pressure);
    }

    public float getHumidity() {
        return humidity;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }
}
