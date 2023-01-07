package com.company.FacadePattern.Computer;

public class RazerMouse implements IMouse{
    @Override
    public void printInfo() {
        System.out.println("Razer Gaming Mouse");
    }

    @Override
    public void printSpecification() {
        System.out.println("SUPER MODEL");
    }

    @Override
    public void printLife() {
        System.out.println("150000 click");
    }
}
