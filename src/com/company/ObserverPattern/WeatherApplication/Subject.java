package com.company.ObserverPattern.WeatherApplication;

public interface Subject {
    void register(Observer observer);
    void remove(Observer observer);

    void notifyObservers();
}
