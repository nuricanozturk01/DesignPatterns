package com.company.StatePattern.GumballMachine;

public interface IState
{
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
