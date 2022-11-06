package com.company.abstractFactory.AbstarctFactoryPizza;

import com.company.abstractFactory.AbstarctFactoryPizza.Pizza.CheesePizza;
import com.company.abstractFactory.AbstarctFactoryPizza.Pizza.ClamPizza;
import com.company.abstractFactory.AbstarctFactoryPizza.Pizza.PepperoniPizza;
import com.company.abstractFactory.AbstarctFactoryPizza.Pizza.Pizza;

public class NYPizzaStore extends PizzaStore
{
    protected Pizza createPizza(String item)
    {
        Pizza pizza = null;

        PizzaIngredientFactory ingredientFactory = new NYPizzaFactory();

        switch (item)
        {
            case "cheese" -> {
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
            }
            case "veggie" -> {
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("New York Style Veggie Pizza");
            }
            case "clam" -> {
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("New York Style Clam Pizza");
            }
            case "pepperoni" -> {
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("New York Style Pepperoni Pizza");
            }
        }
        return pizza;
    }
}
