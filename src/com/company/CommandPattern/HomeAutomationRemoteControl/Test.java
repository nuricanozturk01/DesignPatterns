package com.company.CommandPattern.HomeAutomationRemoteControl;

public class Test
{
    public static void main(String[] args)
    {
        var remoteControl = new RemoteControl();
        var livingRoomLight = new Light();
        var stereo = new Stereo();
        var fan = new CeilingFan("Kitchen");

        var lightOn = new LightOnCommand(livingRoomLight);
        var lightOff = new LightOffCommand(livingRoomLight);
        var cd = new StereoOnWithCD(stereo);
        var stereoOff = new StereoOffCommand(stereo);
        var highFan = new CeilingFanHighCommand(fan);
        var lowFan = new CeilingFanLowCommand(fan);

        remoteControl.setCommand(0, lightOn, lightOff);
        remoteControl.setCommand(1, cd, stereoOff);
        remoteControl.setCommand(2, highFan, lowFan);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

       // remoteControl.offButtonWasPushed(4);



    }
}
