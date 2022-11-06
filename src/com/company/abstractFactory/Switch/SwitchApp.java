package com.company.abstractFactory.Switch;


public class SwitchApp {


    /**
     * You are implementing an application for a switch producing factory. The factory produces different brands
     * of mechanical keyboard switches namely, CherryMX and Gateron. Every switch composed of a coil spring, key cap,
     * stem(has two types linear and tactile). The CherryMXBrand is a SwitchMaker(GateronBrand is also a switch maker)
     * where a switch maker has two methods createSwitch and assembleSwitch(Hint: Check the example given in your
     * textbook...) one calls assembleSwitch method of the switchMaker and provides type of the switch they want.
     * Switches has types of linear, tactile and clicky. assembleSwitch method should call createSwitch method with
     * this type and creates a linear, tactile or clicky switch with switchComponentFactory of the the related brand.
     *
     * Hint: Every concrete switch must take a SwitchComponentFactory to be able to gather parts for their type.
     * Therefore, linear switches should use Light coils, tactile switches should use Medium coils and clicky switches
     * should use Heavy coils.
     *
     * You are given;
     * - SwitchApp
     * - KeyCap interface
     * - Stem interface
     * - PressureCN Enum
     * - CoilSpring interface
     * - Switch abstract class
     * - SwitchComponentFactory
     * - SwitchMaker classes
     *
     * You are expected to all related parts from the given brands, their component factories and corresponding brands(
     * CherryMX and Gateron, dont forget they are switch makers!...) with three main types of switches, Linear, Tactile
     * and Clicky.
     *
     * Hint: Check the example in your book(Head First...)
     *
     * Notes:
     * 1 - You are not allowed to alter the given classes!
     * 2 - Classes you have created must implement interfaces properly.
     * 3 - If you implement everthing properly then you should be able to see an output such as this,
     *
     * Example output:
     * Coil is placed into base
     * Stem is placed on to coil
     * KeyCap is placed on to the stem
     * Switch{name='CherryMX', keyCap=CherryMXKeyCap, stem=CherryMXLinearStem, coilSpring=CherryMXCoil{CoilSpring{pressureCN=45}}}
     *
     * */
    public static void main(String[] args) {
        SwitchMaker cherryMXMaker = new CherryMXBrand();
        Switch cherryMXLinearSwitch = cherryMXMaker.assembleSwitch("linear");

        System.out.println(cherryMXLinearSwitch);

        System.out.println();

        SwitchMaker gateronMaker = new GateronBrand();
        Switch gateronSwitch = gateronMaker.assembleSwitch("linear");

        System.out.println(gateronSwitch);

    }

}
