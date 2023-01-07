package com.company.FacadePattern.Computer;

public interface ICPU extends IComponent
{
    void overclock();

    default void run()
    {
        printInfo();
        overclock();
    }
}
