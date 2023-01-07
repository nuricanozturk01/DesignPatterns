package com.company.FacadePattern.HomeTheater.Components;

public class DVDPlayer
{
    private String description;
    private Amplifier amplifier;

    public DVDPlayer(String description, Amplifier amplifier) {
        this.description = description;
        this.amplifier = amplifier;
    }

    public void on()
    {
        System.out.println(description + " on");
    }

    public void play(String movie)
    {
        System.out.println(description + " playing \"" + movie + "\"");
    }

    public void stop(String movie)
    {
        System.out.println(description + " stopped " + movie);
    }

    public void eject()
    {
        System.out.println(description + " eject");
    }

    public void off()
    {
        System.out.println(description + " off");
    }

    public String getDescription()
    {
        return description;
    }
}
