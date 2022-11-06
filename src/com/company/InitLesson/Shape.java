package com.company.InitLesson;

public class Shape
{
    private String name;

    public Shape(String name)
    {
        this.name = name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString()
    {
        return "Name of Shape is: " + name;
    }
}
