package com.company.ObserverPattern;


import com.company.ObserverPattern.Observable.IObservable;
import com.company.ObserverPattern.Observable.YoutubeChannel;
import com.company.ObserverPattern.Observer.Membership;
import com.company.ObserverPattern.Observer.Subscriber;
import com.company.ObserverPattern.Observer.User;
import com.company.ObserverPattern.Post.Video;

public class Main {
    public static void main(String[] args)
    {
        IObservable channel = new YoutubeChannel("Channel 1");

        User subscriber1 = new Subscriber("Elena","OZTURK", channel);
        User subscriber2 = new Subscriber("Derek","Wick", channel);
        User membership1 = new Membership("Gale", "KOC", channel);
        User membership2 = new Membership("Lane", "ERTAS", channel);

        Video video = new Video("A", false, channel);
        System.out.println();
        Video video2 = new Video("B", true, channel);



    }
}