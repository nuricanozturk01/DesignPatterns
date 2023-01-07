package com.company.ObserverPattern.YoutubeChannel.Observable;


import com.company.ObserverPattern.YoutubeChannel.Observer.IObserver;
import com.company.ObserverPattern.YoutubeChannel.Post.Video;

public interface IObservable
{
    void add(IObserver observer);
    void remove(IObserver observer);
    void notifySubscribers(Video video);

    void addVideo(Video video);
}
