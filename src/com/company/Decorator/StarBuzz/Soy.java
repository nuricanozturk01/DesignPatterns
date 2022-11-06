package com.company.Decorator.StarBuzz;
@SuppressWarnings("all")
public class Soy extends IDecorator
{
    private final String EXTENSION_NAME = "SOY";
    private final double EXTENSION_PRICE = .25;
    private Beverage beverage;

    public Soy(Beverage beverage)
    {
        this.beverage = beverage;
        setDescription(beverage.getDescription() + ", " + EXTENSION_NAME);
    }

    @Override
    public double cost() {
        return beverage.cost() + EXTENSION_PRICE;
    }
}
