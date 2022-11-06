package com.company.CommandPattern.WizardGoblin;

public class ShrinkSpell implements Command
{
    private Target target;
    @Override
    public void execute(Target target)
    {
        if (target.getSize().ordinal() == 0)
            return;

        this.target = target;

        target.setSize(Size.values()[target.getSize().ordinal() - 1]);
    }
    @Override
    public void undo()
    {

        if (target != null)
        {
            target.setSize(Size.values()[target.getSize().ordinal() + 1]);

            System.out.println("Undid the last command: " + target);
        }

        target = null;
    }
}
