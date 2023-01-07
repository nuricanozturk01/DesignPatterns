package com.company.AbstractFactoryPattern.PizzaStore.Store;

import com.company.AbstractFactoryPattern.PizzaStore.pizza.CheesePizza;
import com.company.AbstractFactoryPattern.PizzaStore.pizza.ClamPizza;
import com.company.AbstractFactoryPattern.PizzaStore.pizza.Pizza;
import com.company.AbstractFactoryPattern.PizzaStore.factory.PizzaIngredientFactoryChicago;

public class PizzaStoreChicago extends PizzaStore
{
    @Override
    protected Pizza createPizza(String name)
    {
        var factory = new PizzaIngredientFactoryChicago();

        Pizza pizza = null;

        switch (name)
        {
            case "cheese" -> {
                pizza = new CheesePizza(factory);
                pizza.setName("Chicago Cheese Pizza");
            }

            case "clam" -> {
                pizza = new ClamPizza(factory);
                pizza.setName("Chicago Clam Pizza");
            }

        }
        return pizza;
    }
}
