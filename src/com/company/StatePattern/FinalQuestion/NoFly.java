package com.company.StatePattern.FinalQuestion;

public class NoFly implements IFly
{
    public NoFly() {
        fly();
    }

    @Override
    public void fly() {
        System.out.println("No Fly");
    }
}
