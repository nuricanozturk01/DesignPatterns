package com.company.FacadePattern.HomeTheater.Components;

public class TheaterLight
{
    private String description;

    public TheaterLight(String description) {
        this.description = description;
    }

    public void dim(int lumen)
    {
        System.out.printf(description + " dimming to %d %%\n",lumen);
    }

    public void on()
    {
        System.out.println(description + " on!!!");
    }
}
