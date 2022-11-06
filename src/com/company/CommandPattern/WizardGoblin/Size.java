package com.company.CommandPattern.WizardGoblin;

public enum Size
{
    SMALL("small"), NORMAL("normal"), LARGE("large");
    private String size;

    Size(String size)
    {
        this.size = size;
    }

    @Override
    public String toString() {
        return size;
    }
}
