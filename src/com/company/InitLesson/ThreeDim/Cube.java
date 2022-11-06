package com.company.InitLesson.ThreeDim;

public class Cube extends ThreeDimShape{

    private double edge;

    public Cube(String name)
    {
        super(name);
    }

    public Cube(String name, double edge)
    {
        super(name);
        this.edge = edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public double getVolume()
    {
        return Math.pow(edge, 3);
    }

    @Override
    public String toString()
    {
        return "Volume of " + getName() + " is " + getVolume();
    }
}
