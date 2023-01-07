package com.company.AbstractFactoryPattern.PizzaStore.Store;

import com.company.AbstractFactoryPattern.PizzaStore.pizza.Pizza;

public abstract class PizzaStore
{
    protected abstract Pizza createPizza(String name);

    public Pizza orderPizza(String name) {
        var pizza = createPizza(name);
        System.out.println("----- Making a " + pizza.getName() + " ------");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
