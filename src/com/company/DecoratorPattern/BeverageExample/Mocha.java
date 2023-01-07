package com.company.DecoratorPattern.BeverageExample;

public class Mocha extends CondimentDecorator{

    private final double PRICE = .10;
    private final String DESCRIPTION = " Mocha";

    private final Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        setDescription(beverage.getDescription() + DESCRIPTION);
    }

    @Override
    public double cost() {
        return PRICE + beverage.cost();
    }
}
