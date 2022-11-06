package com.company.CommandPattern.WizardGoblin;

public class VisibilitySpell implements Command
{
    private Target target;
    @Override
    public void execute(Target target)
    {
        target.setVisibility(Visibility.VISIBLE);
        this.target = target;
    }

    @Override
    public void undo()
    {
        if (target != null)
        {
            target.setVisibility(Visibility.INVISIBLE);

            System.out.println("Undid the last command: " + target);
        }
        target = null;
    }
}
