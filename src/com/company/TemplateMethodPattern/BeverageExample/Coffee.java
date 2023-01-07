package com.company.TemplateMethodPattern.BeverageExample;

public class Coffee extends CaffeineBeverage{
    @Override
    protected void brew()
    {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    protected void addCondiments()
    {
        System.out.println("Adding sugar and milk");
    }
}
