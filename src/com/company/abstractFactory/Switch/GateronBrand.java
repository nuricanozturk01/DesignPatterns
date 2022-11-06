package com.company.abstractFactory.Switch;



import com.company.abstractFactory.Switch.gateron.GateronFactory;


public class GateronBrand extends SwitchMaker
{
    @Override
    Switch createSwitch(String type) {
        GateronFactory factory = new GateronFactory();

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
