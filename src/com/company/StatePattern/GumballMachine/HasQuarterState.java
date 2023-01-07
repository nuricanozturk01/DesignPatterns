package com.company.StatePattern.GumballMachine;

public class HasQuarterState implements IState
{
    private final GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine)
    {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter()
    {
        System.out.println("You cannot insert quarter....");
    }

    @Override
    public void ejectQuarter()
    {
        System.out.println("Quarter returned...");
        gumballMachine.setExistingState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank()
    {
        System.out.println("Turned....");
        gumballMachine.setExistingState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense()
    {
        System.out.println("No dispensed...");
    }
}
