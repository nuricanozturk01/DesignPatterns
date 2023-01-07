package com.company.ObserverPattern.YoutubeChannel.Observer;


import com.company.ObserverPattern.YoutubeChannel.Observable.IObservable;
import com.company.ObserverPattern.YoutubeChannel.Post.Video;

public class Subscriber extends User
{


    public Subscriber(String name, String surname, IObservable observable)
    {
        super(name, surname, false, observable);
    }

    @Override
    public void update(Video video)
    {
        System.out.println("Wake up " + getFullName() + "!! " + video.getVideoName() + " uploaded new Video.");
    }
}
