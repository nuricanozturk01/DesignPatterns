package com.company.StrategyPattern.UDuckSim.FlyBehavour;

public class NoFly implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("I cannot fly...");
    }
}
