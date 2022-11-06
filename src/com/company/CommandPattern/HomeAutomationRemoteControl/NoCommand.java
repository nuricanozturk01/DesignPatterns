package com.company.CommandPattern.HomeAutomationRemoteControl;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("NOTHING!!!");
    }

    @Override
    public void undo() {
        System.out.println("NO UNDO");
    }
}
