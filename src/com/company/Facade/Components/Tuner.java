package com.company.Facade.Components;

public class Tuner
{
    private String description;
    private Amplifier amplifier;

    public Tuner(String description, Amplifier amplifier) {
        this.description = description;
        this.amplifier = amplifier;
    }
}
