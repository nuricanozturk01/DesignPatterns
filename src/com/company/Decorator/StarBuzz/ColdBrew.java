package com.company.Decorator.StarBuzz;

public class ColdBrew extends Beverage
{
    private final String COFFEE_NAME = "COLD BREW";
    private final double COFFEE_PRICE = 3.0;

    public ColdBrew()
    {
        setDescription(COFFEE_NAME);
    }

    @Override
    public double cost() {
        return COFFEE_PRICE;
    }
}
