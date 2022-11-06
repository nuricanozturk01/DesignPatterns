package com.company.InitLesson.ThreeDim;


public class Cylinder extends ThreeDimShape
{
    private double diameter;
    private double height;

    public Cylinder(String name)
    {
        super(name);
    }

    public Cylinder(String name, double diameter, double height)
    {
        super(name);
        this.diameter = diameter;
        this.height = height;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getVolume()
    {
        return Math.PI * Math.pow(diameter , 2) * height;
    }


    @Override
    public String toString()
    {
        return "Volume of " + getName() + " is " + getVolume();
    }

}
