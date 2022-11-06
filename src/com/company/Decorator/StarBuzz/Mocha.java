package com.company.Decorator.StarBuzz;

public class Mocha extends IDecorator
{
    private final String EXTENSION_TYPE = "MOCHA";
    private final double EXTENSION_PRICE = .50;
    private Beverage beverage;

    public Mocha(Beverage beverage)
    {
        this.beverage = beverage;
        setDescription(beverage.getDescription() + ", " + EXTENSION_TYPE);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + EXTENSION_TYPE;
    }

    @Override
    public double cost()
    {
        return beverage.cost() + EXTENSION_PRICE;
    }
}
