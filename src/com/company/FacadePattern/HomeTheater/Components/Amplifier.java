package com.company.FacadePattern.HomeTheater.Components;

public class Amplifier
{
    private String description;
    public Amplifier(String description) {
        this.description = description;
    }

    public void on()
    {
        System.out.println(description + " setting DVD Player to Top-O-Line DVD Player");
    }

    public void setDVD(DVDPlayer dvdPlayer)
    {
        System.out.println(description + " setting DVD Player to " + dvdPlayer.getDescription());
    }

    public void setSurroundSound()
    {
        System.out.println(description + " surround on (5 speaker, 1 subwoofer)");
    }

    public void setVolume(int i)
    {
        System.out.println(description + " setting volume to" + i);
    }

    public void off() {
        System.out.println(description + " off!!!");
    }
}
