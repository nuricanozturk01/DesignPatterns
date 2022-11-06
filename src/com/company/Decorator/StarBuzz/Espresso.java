package com.company.Decorator.StarBuzz;

class Espresso extends Beverage
{
    private final String COFFEE_NAME = "ESPRESSO";
    private final double PRICE = 2.0;

    public Espresso()
    {
        setDescription(COFFEE_NAME);
    }



    @Override
    public double cost()
    {
        return PRICE;
    }
}
