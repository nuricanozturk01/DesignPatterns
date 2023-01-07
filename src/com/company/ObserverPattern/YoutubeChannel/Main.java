package com.company.ObserverPattern.YoutubeChannel;


import com.company.ObserverPattern.YoutubeChannel.Observable.*;
import com.company.ObserverPattern.YoutubeChannel.Observer.*;

import com.company.ObserverPattern.YoutubeChannel.Post.*;

public class Main {
    public static void main(String[] args)
    {
        IObservable channel = new YoutubeChannel("Channel 1");

        User subscriber1 = new Subscriber("Elena","OZTURK", channel);
        User subscriber2 = new Subscriber("Beste","Wick", channel);
        User membership1 = new Membership("Gale", "KOC", channel);
        User membership2 = new Membership("Lane", "ERTAS", channel);

        Video video = new Video("A", false, channel);
        System.out.println();
        Video video2 = new Video("B", true, channel);



    }
}