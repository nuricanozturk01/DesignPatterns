package com.company.StatePattern.GumballMachine;

public class Main
{
    public static void main(String[] args)
    {
        var machine = new GumballMachine(5);
        System.out.println("Gumball Machine");

        machine.insertQuarter();
        machine.turnCrank();
    }
}
