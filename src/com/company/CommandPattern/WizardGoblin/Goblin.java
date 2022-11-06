package com.company.CommandPattern.WizardGoblin;

public class Goblin extends Target
{

    public Goblin()
    {
        setVisibility(Visibility.VISIBLE);
        setSize(Size.NORMAL);
    }

    @Override
    public String toString()
    {
        return "Goblin [Size: " + getSize() +
                ", Visibility: " + getVisibility() + "]";
    }

}
