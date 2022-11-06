package com.company.CommandPattern.WizardGoblin;

public class EnlargementSpell implements Command
{
    private Target target;
    @Override
    public void execute(Target target)
    {
        if (target.getSize().ordinal() == Size.values().length - 1)
        {
            System.out.println("Cannot enlarge anymore");
            return;
        }

        this.target = target;

        target.setSize(Size.values()[target.getSize().ordinal() + 1]);
    }

    @Override
    public void undo()
    {
        if (target.getSize().ordinal() == Size.values().length)
        {
            System.out.println("Cannot enlarge anymore");
            return;
        }

        target.setSize(Size.values()[target.getSize().ordinal() - 1]);
    }
}
