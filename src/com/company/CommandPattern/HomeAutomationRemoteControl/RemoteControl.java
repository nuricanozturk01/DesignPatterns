package com.company.CommandPattern.HomeAutomationRemoteControl;

public class RemoteControl
{
    private final Command[] onCommands;
    private final Command[] offCommands;
    private Command undoCommands;

    public RemoteControl()
    {
        onCommands = new Command[7];
        offCommands = new Command[7];

        var noCommand = new NoCommand();

        undoCommands = noCommand;

        for (int i = 0; i < 7; i++)
        {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command on, Command off)
    {
        onCommands[slot] = on;
        offCommands[slot] = off;
    }

    public void onButtonWasPushed(int slot)
    {
        onCommands[slot].execute();
        undoCommands = onCommands[slot];
    }

    public void offButtonWasPushed(int slot)
    {
        offCommands[slot].execute();
        undoCommands = offCommands[slot];
    }

    public void undoButtonWasPushed(int slot)
    {
        undoCommands.undo();
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();

        builder.append("\n---------------REMOTE CONTROL---------------\n");

        for (int i = 0; i < onCommands.length; i++)
        {
            builder.append(onCommands[i].getClass().getSimpleName());
            builder.append("       ");
            builder.append(offCommands[i].getClass().getSimpleName());
            builder.append("\n");
        }

        return builder.toString();
    }

}
