package com.company.abstractFactory.Switch;



public class GateronLinearStem implements Stem
{
    private final String NAME = getClass().getSimpleName();

    @Override
    public String toString() {
        return NAME;
    }
}
