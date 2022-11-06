package com.company.ObserverPattern.Observable;



import com.company.ObserverPattern.Observer.IObserver;
import com.company.ObserverPattern.Observer.User;
import com.company.ObserverPattern.Post.Video;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel extends Channel
{
    private final List<IObserver> subscribers;
    private final List<Video> videos;

    public YoutubeChannel(String channelName)
    {
        super(channelName);
        subscribers = new ArrayList<>();
        videos = new ArrayList<>();
    }

    @Override
    public void add(IObserver observer)
    {
       subscribers.add(observer);
    }



    @Override
    public void remove(IObserver observer)
    {
        subscribers.remove(observer);
    }

    @Override
    public void notifySubscribers(Video video)
    {
        if (video.isMember())
        {
            for (IObserver sub : subscribers)
                if (((User)sub).isMember())
                    sub.update(video);
        }
        else
        {
            for(IObserver s: subscribers)
                if (!((User)s).isMember())
                    s.update(video);
        }
    }

    @Override
    public void addVideo(Video video)
    {
        videos.add(video);
        notifySubscribers(video);
    }
}
