package com.company.StrategyPattern.UDuckSim;

import com.company.StrategyPattern.UDuckSim.FlyBehavour.FlyWithWings;
import com.company.StrategyPattern.UDuckSim.QuackBehaviour.Quack;

public class Duck1 extends Duck
{
    public Duck1()
    {
        setFlyBehaviour(new FlyWithWings());
        setQuackBehaviour(new Quack());
    }

    @Override
    void display() {
        System.out.println("Duck1");
    }
}
