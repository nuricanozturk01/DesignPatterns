package com.company.FactoryMethodPattern.PizzaStoreExample;

public abstract class PizzaStore
{
    public Pizza orderPizza(String name)
    {
        var pizza = createPizza(name);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
    protected abstract Pizza createPizza(String name);
}
