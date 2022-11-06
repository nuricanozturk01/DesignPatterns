package com.company.CommandPattern.ATM;

import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        KeyPad keyPad = new KeyPad();
        ATM atm = new ATM();
        keyPad.setCommand("enter", new EnterScreen(atm));
        keyPad.setCommand("del", new DeleteScreen(atm));
        keyPad.setCommand("clear", new ClearScreen(atm));

        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.print("> ");
            var cmd = scanner.nextLine();
            if (cmd.equals("exit"))
                break;
            keyPad.runCommand(cmd);
        }

        System.out.println("EXIT");
    }
}
