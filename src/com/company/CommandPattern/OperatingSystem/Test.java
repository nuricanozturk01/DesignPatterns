package com.company.CommandPattern.OperatingSystem;

public class Test
{
    public static void main(String[] args) {
        Shell shell = new Shell();
        Kernel kernel = new Kernel();
        shell.putCommand("list", new ListCommand(kernel));
        shell.putCommand("mkdir", new MakeDirCommand(kernel));
        shell.putCommand("del", new DeleteCommand(kernel));
        shell.putCommand("exit", new QuitCommand(kernel));

        while (true)
            shell.commandText();
    }
}
