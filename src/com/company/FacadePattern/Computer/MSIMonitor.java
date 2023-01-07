package com.company.FacadePattern.Computer;

public class MSIMonitor implements IMonitor
{
    @Override
    public void printInfo() {
        System.out.println("MSI Gaming Monitor");
    }

    @Override
    public void printResolution() {
        System.out.println("2560 x 1440");
    }

    @Override
    public void printSpecification() {
        System.out.println("144 HZ, 1 MS");
    }
}
