package com.company.CommandPattern.ATM;

public class ClearScreen implements Command
{
    private final ATM atm;

    public ClearScreen(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void execute()
    {
        atm.clr();
    }
}
