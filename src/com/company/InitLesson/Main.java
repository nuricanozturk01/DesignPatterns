package com.company.InitLesson;


import com.company.InitLesson.ThreeDim.Cube;
import com.company.InitLesson.ThreeDim.Cylinder;

public class Main
{
    public static void main(String[] args)
    {
        Shape cube = new Cube("MyCube", 3);
        Cylinder cylinder = new Cylinder("MyCylinder", 2, 2);
        System.out.println(cube);
        System.out.println(cylinder);
    }
}
