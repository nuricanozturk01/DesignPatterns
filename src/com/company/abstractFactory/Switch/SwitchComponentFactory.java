package com.company.abstractFactory.Switch;

public interface SwitchComponentFactory {

    public KeyCap createKeyCap();
    public Stem createStem();
    public CoilSpring createCoilSpring(PressureCN pressureCN);

}
