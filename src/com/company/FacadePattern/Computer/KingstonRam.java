package com.company.FacadePattern.Computer;

public class KingstonRam implements IRam{
    @Override
    public void printInfo() {
        System.out.println("Kingston 4000 MHZ CL 16");
    }
}
