package com.company.Decorator.StarBuzz;

public class Whipe extends IDecorator
{
    private final String EXTENSION_TYPE = "WHIPE";
    private final double EXTENSION_PRICE = .40;
    private Beverage beverage;


    public Whipe(Beverage beverage)
    {
        this.beverage = beverage;
    }


    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + EXTENSION_TYPE;
    }

    @Override
    public double cost() {
        return beverage.cost() + EXTENSION_PRICE;
    }
}
