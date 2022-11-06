package com.company.CommandPattern.WizardGoblin;

public class InvisibilitySpell implements Command
{
    private Target target;
    @Override
    public void execute(Target target)
    {
        target.setVisibility(Visibility.INVISIBLE);
        this.target = target;
    }

    @Override
    public void undo() {

        if (target != null)
        {
            target.setVisibility(Visibility.VISIBLE);
            System.out.println("Undid the last command: " + target);
        }
        target = null;

    }
}
