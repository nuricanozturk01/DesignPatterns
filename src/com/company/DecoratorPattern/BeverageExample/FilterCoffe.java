package com.company.DecoratorPattern.BeverageExample;

public class FilterCoffe extends Beverage
{
    private final double PRICE = 10.;
    private final String DESCRIPTION = "Filter Coffee";

    public FilterCoffe()
    {
        setDescription(DESCRIPTION);
    }

    @Override
    public double cost() {
        return PRICE;
    }
}
