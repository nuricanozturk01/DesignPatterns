package com.company.CommandPattern.WizardGoblin;

public class Wizard
{
    private Command prevCommand;
    public void executeCommand(Command command, Target target)
    {
        System.out.println("Wizard casts " + command.getClass().getSimpleName() + " at " + target);

        command.execute(target);

        System.out.println(target);

        prevCommand = command;
    }
    public void undo()
    {
        if (prevCommand != null)
            prevCommand.undo();
    }
}
