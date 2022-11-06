package com.company.CommandPattern.HomeAutomationRemoteControl;

public class StereoOnWithCD implements Command
{

    private Stereo stereo;

    public StereoOnWithCD(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(53);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
