package com.company.StrategyPattern.UDuckSim.QuackBehaviour;

public class Quack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Quack quack");
    }
}
