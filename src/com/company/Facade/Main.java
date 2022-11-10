package com.company.Facade;


import com.company.Facade.Components.*;

public class Main
{
    public static void main(String[] args)
    {
        Amplifier amplifier = new Amplifier("Top-O-Line Amplifier");
        Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner",amplifier);
        DVDPlayer dvdPlayer = new DVDPlayer("Top-O-Line DVD Player",amplifier);
        Projector projector = new Projector("Top-O-Line Projector", dvdPlayer);
        TheaterLight light = new TheaterLight("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popcornPopper = new PopcornPopper("Popcorn Popper");


        HomeTheaterFacade theaterFacade = new HomeTheaterFacade(amplifier, tuner, dvdPlayer, projector,
                light, screen, popcornPopper);
        theaterFacade.watchMovie("Riders of the Lost Ark");
        theaterFacade.endMovie("Riders of the Lost Ark");
    }
}