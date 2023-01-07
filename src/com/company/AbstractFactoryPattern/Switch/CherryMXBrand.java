package com.company.AbstractFactoryPattern.Switch;

import com.company.AbstractFactoryPattern.Switch.cherrymx.CherryMXFactory;


public class CherryMXBrand extends SwitchMaker
{


    @Override
    Switch createSwitch(String type) {
        CherryMXFactory factory = new CherryMXFactory();

        if (type.equalsIgnoreCase("tactile"))
            return new TactileSwitch(factory);
        if (type.equalsIgnoreCase("clicky"))
            return new ClickySwitch(factory, getClass().getSimpleName());

        return new LinearSwitch(factory, getClass().getSimpleName());
    }

    @Override
    Switch assembleSwitch(String type) {
        Switch sw = createSwitch(type);

        sw.gatherParts();
        sw.placeCoilSpring();
        sw.placeStem();
        sw.placeKeyCap();

        return sw;
    }
}
