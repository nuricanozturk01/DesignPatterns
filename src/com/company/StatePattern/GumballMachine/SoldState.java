package com.company.StatePattern.GumballMachine;

public class SoldState implements IState
{
    private final GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine)
    {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter()
    {
        System.out.println("We are already giving you a gumball...");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You are already turned crank...");
    }

    @Override
    public void turnCrank() {
        System.out.println("You cannot turned crank two times...");
    }

    @Override
    public void dispense()
    {
        gumballMachine.releaseBall();

        if (gumballMachine.getCount() > 0)
            gumballMachine.setExistingState(gumballMachine.getNoQuarterState());
        else
        {
            System.out.println("Oops, out of gumballs");
            gumballMachine.setExistingState(gumballMachine.getSoldOutState());
        }
    }
}
