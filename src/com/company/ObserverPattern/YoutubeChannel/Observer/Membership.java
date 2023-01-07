package com.company.ObserverPattern.YoutubeChannel.Observer;

import com.company.ObserverPattern.YoutubeChannel.Observable.IObservable;
import com.company.ObserverPattern.YoutubeChannel.Post.Video;

public class Membership extends User
{

    public Membership(String name, String surname, IObservable observable)
    {
        super(name, surname, true, observable);
    }

    @Override
    public void update(Video video)
    {
        System.out.println("Wake up " + getFullName() + "!! " + video.getVideoName() + " uploaded new Video without add for fans");
    }
}
