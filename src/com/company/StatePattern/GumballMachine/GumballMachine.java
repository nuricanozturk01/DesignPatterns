package com.company.StatePattern.GumballMachine;

import javax.swing.plaf.nimbus.State;

class GumballMachine
{
    private final IState soldOutState;
    private final IState noQuarterState;
    private final IState hasQuarterState;
    private final IState soldState;

    private IState existingState;
    private int count = 0;

    public GumballMachine(int count)
    {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);

        this.count = count;

        existingState = count > 0 ? noQuarterState : soldOutState;
    }


    public void insertQuarter()
    {
        existingState.insertQuarter();
    }

    public void ejectQuarter()
    {
        existingState.ejectQuarter();
    }


    public void turnCrank()
    {
        existingState.turnCrank();
        existingState.dispense();
    }

    public void releaseBall()
    {
        System.out.println("A gumball comes rolling out the slot...");
        count = count != 0 ? count - 1 : count;
    }

    public IState getSoldOutState() {
        return soldOutState;
    }

    public IState getNoQuarterState() {
        return noQuarterState;
    }

    public IState getHasQuarterState() {
        return hasQuarterState;
    }

    public IState getSoldState() {
        return soldState;
    }

    public IState getExistingState() {
        return existingState;
    }

    public void setExistingState(IState existingState) {
        this.existingState = existingState;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
