package com.company.CommandPattern.CommandLine;

class Test
{
    public static void main(String[] args)
    {
        var shell = Shell.createShell();

        var kernel = new Kernel();

        shell.setName("nuricanozturk");
        shell.setVersion("qwerty667");

        shell.addCommand("dir", new ListCommand(kernel));
        shell.addCommand("del", new DelCommand(kernel));
        shell.addCommand("mkdir", new MakeDirCommand(kernel));
        shell.addCommand("exit", new QuitCommand(kernel));

        for (;;)
            shell.commandText();
    }
}
