package com.company.FacadePattern.Computer;

public interface ICase extends IComponent
{
    void pressStart();
    void startFan();

    void offCase();
    void stopFan();
    default void run()
    {
        pressStart();
        startFan();
    }

    default void off()
    {
        stopFan();
        offCase();
    }
}
