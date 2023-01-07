package com.company.FacadePattern.Computer;

public class IntelCoreI713500 implements ICPU{
    @Override
    public void printInfo() {
        System.out.println("CPU: Intel Core i7-13500");
    }

    @Override
    public void overclock() {
        System.out.println("No Overclock...");
    }
}
