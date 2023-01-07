package com.company.StatePattern.FinalQuestion;

public class HungryState implements IModeState
{
    private Duck duck;

    public HungryState(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void fed() {
        System.out.println("Changed hungry to joyful");
        duck.setState(duck.joyfulState);
    }

    @Override
    public void pet() {

    }

    @Override
    public void leaveAlone() {

    }
}
