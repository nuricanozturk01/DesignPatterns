package com.company.StatePattern.FinalQuestion;

public class JoyfulState implements IModeState
{
    private Duck duck;

    public JoyfulState(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void fed() {

    }

    @Override
    public void pet() {

    }

    @Override
    public void leaveAlone() {
        duck.setState(duck.angryState);
    }
}
