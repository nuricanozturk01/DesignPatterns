package com.company.ObserverPattern.Observable;


import com.company.ObserverPattern.Observer.IObserver;
import com.company.ObserverPattern.Post.Video;

public interface IObservable
{
    void add(IObserver observer);
    void remove(IObserver observer);
    void notifySubscribers(Video video);

    void addVideo(Video video);
}
