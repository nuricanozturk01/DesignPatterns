package com.company.StrategyPattern.UDuckSim.QuackBehaviour;

public class NoQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("I cannot quack...");
    }
}
