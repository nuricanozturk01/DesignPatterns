package com.company.StatePattern.GumballMachine;

public class NoQuarterState implements IState
{
    private final GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine)
    {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter()
    {
        System.out.println("We giving your quarters....");
        gumballMachine.setExistingState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("wait...");
    }

    @Override
    public void turnCrank() {
        System.out.println("You can turn crank");
        gumballMachine.setExistingState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("Not dispense");
    }
}
