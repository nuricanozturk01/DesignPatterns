package com.company.CommandPattern.HomeAutomationRemoteControl;

public class CeilingFan
{
    private String location;
    private int speed;


    public CeilingFan(String location)
    {
        this.location = location;
        speed = Level.LOW.ordinal();
    }


    public void high()
    {
        speed = Level.HIGH.ordinal();
    }
    public void medium()
    {
        speed = Level.MEDIUM.ordinal();
    }

    public void low()
    {
        speed = Level.LOW.ordinal();
    }
    public void off()
    {
        speed = Level.OFF.ordinal();
    }
    public int getSpeed() {
        return speed;
    }
}
