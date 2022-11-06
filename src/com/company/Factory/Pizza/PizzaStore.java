package com.company.Factory.Pizza;

public abstract class PizzaStore
{
    public Pizza orderPizza(String type)
    {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.cooking();
        pizza.cutting();
        pizza.boxing();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
