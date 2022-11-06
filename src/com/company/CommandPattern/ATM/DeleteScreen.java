package com.company.CommandPattern.ATM;

public class DeleteScreen implements Command
{
    private final ATM atm;

    public DeleteScreen(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void execute()
    {
        atm.del();
    }
}
