package com.company.FacadePattern.HomeTheater.Components;

public class Projector
{
    private String description;
    private DVDPlayer dvdPlayer;

    public Projector(String description, DVDPlayer dvdPlayer)
    {
        this.description = description;
        this.dvdPlayer = dvdPlayer;
    }

    public void on()
    {
        System.out.println(description + " on");
    }

    public void wideScreenMode()
    {
        System.out.println(description + " in widescreen mode (16x9 aspect ratio)");
    }

    public void off()
    {
        System.out.println(description + " off!!!");
    }
}
