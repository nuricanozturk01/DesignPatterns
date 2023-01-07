package com.company.StrategyPattern.UDuckSim;

import com.company.StrategyPattern.UDuckSim.FlyBehavour.FlyBehaviour;
import com.company.StrategyPattern.UDuckSim.QuackBehaviour.QuackBehaviour;

public abstract class Duck
{
    private QuackBehaviour quackBehaviour;
    private FlyBehaviour flyBehaviour;

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void quack() {
        quackBehaviour.quack();
    }

    public void fly() {
        flyBehaviour.fly();
    }

    abstract void display();

    public void print() {
        display();
        quack();
        fly();
    }
}
