package com.company.DecoratorPattern.BeverageExample;

public class Milk extends CondimentDecorator
{

    private final double PRICE = .20;
    private final String DESCRIPTION = " Milk";

    private final Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
        setDescription(beverage.getDescription() + DESCRIPTION);
    }

    @Override
    public double cost() {
        return PRICE + beverage.cost();
    }
}
