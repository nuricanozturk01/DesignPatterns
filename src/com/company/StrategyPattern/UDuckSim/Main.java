package com.company.StrategyPattern.UDuckSim;

import com.company.StrategyPattern.UDuckSim.FlyBehavour.NoFly;

public class Main
{
    public static void main(String[] args) {
        Duck duck1 = new Duck1();
        duck1.print();
        duck1.setFlyBehaviour(new NoFly());
        System.out.println("------------------");
        duck1.print();
        System.out.println("------------------");
        Duck duck2 = new Duck2();
        duck2.print();

    }
}
