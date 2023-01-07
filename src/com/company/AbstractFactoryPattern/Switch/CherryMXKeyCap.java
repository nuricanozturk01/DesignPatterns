package com.company.AbstractFactoryPattern.Switch;



public class CherryMXKeyCap implements KeyCap
{
    private final String NAME = getClass().getSimpleName();


    @Override
    public String toString() {
        return NAME;
    }
}
