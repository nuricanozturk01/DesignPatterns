package com.company.ObserverPattern.YoutubeChannel.Post;

import com.company.ObserverPattern.YoutubeChannel.Observable.IObservable;

public class Video
{
    private String videoName;
    private boolean isMember;

    public Video(String videoName, boolean isMember, IObservable observable)
    {
        this.videoName = videoName;
        this.isMember = isMember;
        observable.addVideo(this);
    }

    public boolean isMember()
    {
        return isMember;
    }

    public String getVideoName() {
        return videoName;
    }
}
