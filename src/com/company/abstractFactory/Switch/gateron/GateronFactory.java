package com.company.abstractFactory.Switch.gateron;

import com.company.abstractFactory.Switch.*;

public class GateronFactory implements SwitchComponentFactory
{
    @Override
    public KeyCap createKeyCap()
    {
        return new GateronKeyCap();
    }

    @Override
    public Stem createStem()
    {
        return new GateronLinearStem();
    }

    @Override
    public CoilSpring createCoilSpring(PressureCN pressureCN)
    {
       return switch (pressureCN)
        {
            case Medium -> new GateronCoil(45);
            case Light -> new GateronCoil(35);
            case Heavy -> new GateronCoil(60);
            case SuperHeavy -> new GateronCoil(80);
        };
    }
}
