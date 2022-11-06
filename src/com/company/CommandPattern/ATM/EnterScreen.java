package com.company.CommandPattern.ATM;

public class EnterScreen implements Command
{
    private final ATM atm;

    public EnterScreen(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void execute()
    {
        atm.enter();
    }
}
