package com.company.AbstractFactoryPattern.Switch;


public class ClickySwitch extends Switch
{
    private SwitchComponentFactory factory;
    private String name;
    public ClickySwitch(SwitchComponentFactory factory, String name)
    {
        this.factory = factory;
        this.name = name;
    }


    @Override
    void gatherParts() {
        factory.createKeyCap();
        factory.createStem();
        factory.createCoilSpring(PressureCN.Heavy);
        setName(name);
    }
}
