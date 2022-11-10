package com.company.Facade;


import com.company.Facade.Components.*;

public class HomeTheaterFacade
{
    private Amplifier amplifier;
    private Tuner tuner;
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private TheaterLight theaterLight;
    private Screen screen;
    private PopcornPopper popcornPopper;

    public HomeTheaterFacade(Amplifier amplifier, Tuner tuner, DVDPlayer dvdPlayer, Projector projector,
                             TheaterLight theaterLight, Screen screen, PopcornPopper popcornPopper)
    {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.theaterLight = theaterLight;
        this.screen = screen;
        this.popcornPopper = popcornPopper;
    }


    public void watchMovie(String movie)
    {
        System.out.println("Get Ready to watch a movie");
        popcornPopper.on();
        popcornPopper.pop();
        theaterLight.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setDVD(dvdPlayer);
        amplifier.setSurroundSound();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie(String movie)
    {
        System.out.println("Shutting movie theater down...");
        popcornPopper.off();
        theaterLight.on();
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.stop(movie);
        dvdPlayer.eject();
        dvdPlayer.off();
    }
}
