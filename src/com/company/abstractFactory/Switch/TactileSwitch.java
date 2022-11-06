package com.company.abstractFactory.Switch;

public class TactileSwitch extends Switch
{
    private SwitchComponentFactory factory;
    public TactileSwitch(SwitchComponentFactory factory)
    {
        this.factory = factory;
    }
    @Override
    void gatherParts()
    {
        factory.createKeyCap();
        factory.createStem();
        factory.createCoilSpring(PressureCN.Light);
    }
}
