package com.company.ObserverPattern.Post;

import com.company.ObserverPattern.Observable.IObservable;

public class Video
{
    private String videoName;
    private boolean isMember;

    public Video(String videoName, boolean isMember, IObservable observable) {
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
