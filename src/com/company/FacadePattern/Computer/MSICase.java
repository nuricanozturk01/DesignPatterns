package com.company.FacadePattern.Computer;

public class MSICase implements ICase
{
    @Override
    public void pressStart()
    {
        printInfo();
    }

    @Override
    public void startFan()
    {
        System.out.println("Running fans");
    }

    @Override
    public void offCase()
    {
        System.out.println("MSI Case off");
    }

    @Override
    public void stopFan()
    {
        System.out.println("Fans are stopped");
    }

    @Override
    public void printInfo()
    {
        System.out.println("Give an electricty");
        System.out.println("MSI Case on");
    }
}
