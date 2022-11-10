package com.company.Facade.Components;

public class Screen
{
    private String description;

    public Screen(String description) {
        this.description = description;
    }

    public void down()
    {
        System.out.println(description + " going down!!!");
    }

    public void up()
    {
        System.out.println(description + " Going Up");
    }
}
