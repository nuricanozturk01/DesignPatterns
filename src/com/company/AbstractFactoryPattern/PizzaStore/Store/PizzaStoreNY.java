package com.company.AbstractFactoryPattern.PizzaStore.Store;

import com.company.AbstractFactoryPattern.PizzaStore.pizza.CheesePizza;
import com.company.AbstractFactoryPattern.PizzaStore.pizza.ClamPizza;
import com.company.AbstractFactoryPattern.PizzaStore.pizza.Pizza;
import com.company.AbstractFactoryPattern.PizzaStore.factory.PizzaIngredientFactoryNY;

public class PizzaStoreNY extends PizzaStore
{
    @Override
    protected Pizza createPizza(String name)
    {
        var factory = new PizzaIngredientFactoryNY();

        Pizza pizza = null;

        switch (name)
        {
            case "cheese" ->
            {
                pizza = new CheesePizza(factory);
                pizza.setName("NY Cheese Pizza");
            }

            case "clam" ->
            {
                pizza = new ClamPizza(factory);
                pizza.setName("NY Clam Pizza");
            }

        }

        return pizza;
    }
}
