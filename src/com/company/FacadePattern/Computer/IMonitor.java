package com.company.FacadePattern.Computer;

public interface IMonitor extends IComponent
{
    void printResolution();
    void printSpecification();

    default void run()
    {
        printInfo();
        printResolution();
        printSpecification();
    }
}
