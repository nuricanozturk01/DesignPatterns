package com.company.CommandPattern.WizardGoblin;

public class Test {
    public static void main(String[] args)
    {
        var wizard = new Wizard();

        var goblin = new Goblin();
        var shrink = new ShrinkSpell();
        var visibility = new VisibilitySpell();
        var invisible = new InvisibilitySpell();
        var enlargement = new EnlargementSpell();

        System.out.println(goblin);

        System.out.println();

        wizard.executeCommand(shrink, goblin);

        wizard.undo();

        System.out.println();
        wizard.executeCommand(invisible, goblin);
        wizard.executeCommand(enlargement, goblin);
        System.out.println();

        wizard.executeCommand(enlargement, goblin);
        wizard.executeCommand(invisible, goblin);

        System.out.println();
        wizard.undo();
        System.out.println(goblin);




    }
}