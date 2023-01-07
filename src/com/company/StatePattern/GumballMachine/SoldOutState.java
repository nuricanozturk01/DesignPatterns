package com.company.StatePattern.GumballMachine;

public class SoldOutState implements IState
{
    private final GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine)
    {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter()
    {
        System.out.println("You already inserted quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("eject quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You alerady turn crank");
    }

    @Override
    public void dispense() {
        System.out.println("dispense");
    }
}
