package com.company.CommandPattern.WizardGoblin;

public interface Command {

    void execute(Target target);
    void undo();
}
