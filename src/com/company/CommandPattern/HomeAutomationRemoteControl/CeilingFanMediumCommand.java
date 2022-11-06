package com.company.CommandPattern.HomeAutomationRemoteControl;

public class CeilingFanMediumCommand implements Command
{
    private CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanMediumCommand(CeilingFan ceilingFan)
    {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute()
    {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }

    @Override
    public void undo()
    {
        if (prevSpeed == Level.HIGH.ordinal())
            ceilingFan.high();
        else if (prevSpeed == Level.MEDIUM.ordinal())
            ceilingFan.medium();
        else if (prevSpeed == Level.LOW.ordinal())
            ceilingFan.low();
        else if (prevSpeed == Level.OFF.ordinal())
            ceilingFan.off();

    }
}
