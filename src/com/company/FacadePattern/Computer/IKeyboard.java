package com.company.FacadePattern.Computer;

public interface IKeyboard extends IComponent
{
    void printType();


    default void run()
    {
        printInfo();
        printType();
    }
}
