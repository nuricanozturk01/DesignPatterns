package com.company.StatePattern.FinalQuestion;

public class Duck {
    IModeState hungryState, angryState, joyfulState;
    IModeState defaultState;

    IFly fly;
    IQuack quack;

    public Duck()
    {
        hungryState = new HungryState(this);
        angryState = new AngryState(this);
        joyfulState = new JoyfulState(this);

        defaultState = angryState;
    }

    public void feed()
    {
        defaultState.fed();
    }

    public void pet()
    {
        defaultState.pet();
    }

    public void leaveAlone()
    {
        defaultState.leaveAlone();
    }

    public void setFly(IFly fly) {
        this.fly = fly;
    }

    public void setQuack(IQuack quack) {
        this.quack = quack;
    }

    public void setState(IModeState state) {
        defaultState = state;
    }
}
