package com.company.CommandPattern.HomeAutomationRemoteControl;

public class Stereo
{
    public void on()
    {
        System.out.println("On: Stereo");
    }

    public void setCD()
    {
        System.out.println("setting CD");
    }

    public void setVolume(int volume)
    {
        System.out.println("Volume is: " + volume);
    }

    public void off()
    {
        System.out.println("Stereo closed!");
    }
}
