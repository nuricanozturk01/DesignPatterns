package com.company.abstractFactory.AbstarctFactoryPizza;

import com.company.abstractFactory.AbstarctFactoryPizza.Pizza.CheesePizza;
import com.company.abstractFactory.AbstarctFactoryPizza.Pizza.Pizza;

public class Test
{
    public static void main(String[] args) {
        PizzaStore store = new NYPizzaStore();

        store.orderPizza("cheese");

        Pizza p = new CheesePizza(new NYPizzaFactory());


    }
}
