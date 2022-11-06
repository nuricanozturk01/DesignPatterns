package com.company.abstractFactory.Switch;

public abstract class SwitchMaker
{
    abstract Switch createSwitch(String type);
    abstract Switch assembleSwitch(String type);
}
