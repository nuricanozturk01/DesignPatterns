package com.company.abstractFactory.Switch;

public class LinearSwitch extends Switch
{
    private SwitchComponentFactory factory;
    private String name;
    public LinearSwitch(SwitchComponentFactory factory, String name)
    {
        this.factory = factory;
        this.name = name;

    }
    @Override
    void gatherParts() {
        keyCap = factory.createKeyCap();
        stem = factory.createStem();
        coilSpring = factory.createCoilSpring(PressureCN.Light);
        setName(this.name);
    }
}
