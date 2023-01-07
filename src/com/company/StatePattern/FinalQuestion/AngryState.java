package com.company.StatePattern.FinalQuestion;

import com.company.StatePattern.FinalQuestion.Duck;
import com.company.StatePattern.FinalQuestion.IModeState;

public class AngryState implements IModeState {
    private Duck duck;

    public AngryState(Duck duck) {
        this.duck = duck;
        duck.setFly(new NoFly());
        duck.setQuack(new NormalQuack());
    }

    @Override
    public void fed() {
        System.out.println("No feed");
    }

    @Override
    public void pet() {
        System.out.println("Changed angry to joyful");
        duck.setState(duck.joyfulState);
    }

    @Override
    public void leaveAlone() {

    }
}
