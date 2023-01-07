package com.company.FacadePattern.Computer;

public class Test
{
    public static void main(String[] args) {
        var computer = new Computer.Builder()
                .setBios(new AmericanBIOS())
                .setCase(new MSICase())
                .setCPU(new IntelCoreI713500())
                .setMonitor(new MSIMonitor())
                .setKeyboard(new EverestKeyboard())
                .setMouse(new RazerMouse())
                .setRam(new KingstonRam())
                .setOperatingSystem(new Windows11())
                .build();

        computer.open();
    }
}
