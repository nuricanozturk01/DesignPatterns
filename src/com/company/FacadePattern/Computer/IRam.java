package com.company.FacadePattern.Computer;

public interface IRam extends IComponent {

    default void run()
    {
        printInfo();
    }
}
