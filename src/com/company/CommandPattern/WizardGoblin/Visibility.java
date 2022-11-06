package com.company.CommandPattern.WizardGoblin;

public enum Visibility
{
    VISIBLE("Visible"), INVISIBLE("Invisible");

    private String visibility;

    Visibility(String visibility) {
        this.visibility = visibility;
    }

    @Override
    public String toString() {
        return visibility;
    }
}
