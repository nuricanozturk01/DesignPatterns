package com.company.ObserverPattern.YoutubeChannel.Observer;


import com.company.ObserverPattern.YoutubeChannel.Post.Video;

public interface IObserver
{
    void update(Video video);
}
