package com.company.AbstractFactoryPattern.Switch;

public abstract class SwitchMaker
{
    abstract Switch createSwitch(String type);
    abstract Switch assembleSwitch(String type);
}
