package com.company.CommandPattern.CommandLine;

import java.util.Hashtable;
import java.util.Scanner;

final class Shell
{
    private String name = "CMD";
    private String version = "1.0.0";
    private final Hashtable<String, Command> commands;
    private final Scanner keyboard;
    private final static Shell m_shell = new Shell(); // Singleton

    public String getName()
    {
        return name;
    }
    public String getVersion()
    {
        return version;
    }
    public void setVersion(String version)
    {
        this.version = version;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    private Shell()
    {
        System.out.printf("%s : %s\n", name, version);
        System.out.println("============================");
        keyboard = new Scanner(System.in);
        commands = new Hashtable<>();
    }
    public static Shell createShell() // Singleton
    {
        return m_shell == null ? new Shell() : m_shell;
    }

    public void addCommand(String cmd, Command command)
    {
        commands.put(cmd, command);
    }

    public void commandText()
    {
        System.out.printf("%s@%s ~ %%:", name, version);

        var str = keyboard.nextLine();
        var content = str.split(" ");

        switch (content.length)
        {
            case 1 -> acceptCommand(content[0], "");
            case 2 -> acceptCommand(content[0], content[1]);
            default -> System.out.println("Bad Command!!!");
        }
    }

    private void acceptCommand(String cmd, String path)
    {
        if (commands.containsKey(cmd))
        {
            var command = commands.get(cmd);
            command.setPath(path);
            command.execute();
        }

        else System.out.println("Bad Command!!!");
    }
}
