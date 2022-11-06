package com.company.InitLesson.ThreeDim;


import com.company.InitLesson.Calculations.IThreeDimensional;
import com.company.InitLesson.Shape;

abstract class ThreeDimShape extends Shape implements IThreeDimensional
{
    public ThreeDimShape(String name)
    {
        super(name);
    }
}
