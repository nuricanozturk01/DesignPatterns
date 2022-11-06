package com.company.CommandPattern.OperatingSystem;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Hashtable;
import java.util.Scanner;

// invoker
public class Shell
{
    private final Hashtable<String, Command> commands;
    private final String name = "COMMAND PROMPT";
    private final String version = "1.1.0";

    public Shell()
    {
        System.out.printf("%s version: %s\n", name, version);
        System.out.println("==============================");

        this.commands = new Hashtable<>();
    }

    @Deprecated(since = "1.1.0")
    public void putCommandViaReflection(String command, Class<?> cls)
    {
        Constructor<?> constructor = null;
        Command obj = null;
        try
        {
            constructor = cls.getConstructor(Kernel.class);
            obj = (Command) constructor.newInstance(new Kernel());

        }
        catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e)
        {
            throw new RuntimeException(e);
        }

        commands.put(command,  obj);
    }

    public void putCommand(String command, Command cmd)
    {
        commands.put(command,  cmd);
    }
    public void commandText()
    {
        System.out.print("$~ ");

        var scanner = new Scanner(System.in);
        var text = scanner.nextLine();

        String[] content = text.split(" ");

        switch (content.length)
        {
            case 1 -> accept(content[0], "");
            case 2 -> accept(content[0], content[1]);
            default -> System.out.println("BAD COMMAND!!!");
        }
    }

    private void accept(String cmd, String path)
    {
        if (commands.containsKey(cmd))
        {
            var cmnd = commands.get(cmd);
            cmnd.setPath(path);
            cmnd.execute();
        }
        else System.out.println("BAD COMMAND!!!");
    }
}
