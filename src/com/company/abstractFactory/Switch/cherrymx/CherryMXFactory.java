package com.company.abstractFactory.Switch.cherrymx;

import com.company.abstractFactory.Switch.*;

public class CherryMXFactory implements SwitchComponentFactory
{
    @Override
    public KeyCap createKeyCap()
    {
        return new CherryMXKeyCap();
    }

    @Override
    public Stem createStem()
    {
        return new CherryMXLinearStem();
    }

    @Override
    public CoilSpring createCoilSpring(PressureCN pressureCN)
    {
        return switch (pressureCN)
                {
                    case Light -> new CherryMXCoil(45);
                    case Medium -> new CherryMXCoil(55);
                    case Heavy -> new CherryMXCoil(60);
                    case SuperHeavy -> new CherryMXCoil(80);
                };

    }
}
