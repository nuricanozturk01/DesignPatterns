package com.company.CommandPattern.ATM;

import java.util.HashMap;

public class KeyPad
{
    private final HashMap<String, Command> commands;

    public KeyPad()
    {
        commands = new HashMap<>();
    }

    public void setCommand(String cmnd, Command command)
    {
        commands.put(cmnd, command);
    }

    public void runCommand(String command)
    {
        if (commands.containsKey(command))
            commands.get(command).execute();
        else System.out.println("BAD COMMAND!!!");
    }
}
