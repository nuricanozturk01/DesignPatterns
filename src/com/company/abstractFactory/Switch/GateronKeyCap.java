package com.company.abstractFactory.Switch;



public class GateronKeyCap implements KeyCap
{
    private final String NAME = getClass().getSimpleName();

    @Override
    public String toString() {
        return NAME;
    }
}
