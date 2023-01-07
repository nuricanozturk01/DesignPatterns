package com.company.StrategyPattern.UDuckSim;

import com.company.StrategyPattern.UDuckSim.FlyBehavour.FlyWithWings;
import com.company.StrategyPattern.UDuckSim.QuackBehaviour.Quack;
import com.company.StrategyPattern.UDuckSim.QuackBehaviour.Sequeak;

public class Duck2 extends Duck
{
    public Duck2()
    {
        setFlyBehaviour(new FlyWithWings());
        setQuackBehaviour(new Sequeak());
    }

    @Override
    void display() {
        System.out.println("Duck2");
    }
}
