package com.company.FacadePattern.Computer;

public interface IOperatingSystem
{
    void printInfo();
    default void run()
    {
        printInfo();
    }
}
