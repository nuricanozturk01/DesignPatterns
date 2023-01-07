package com.company.FacadePattern.Computer;

public interface IMouse extends IComponent
{
    void printSpecification();
    void printLife();

    default void run()
    {
        printInfo();
        printSpecification();
        printLife();
    }
}
