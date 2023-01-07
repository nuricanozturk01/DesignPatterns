package com.company.FactoryMethodPattern.PizzaStoreExample;

public class NYPizzaStore extends PizzaStore
{
    @Override
    protected Pizza createPizza(String name)
    {
       return switch (name) {
            case "cheese" -> new NYStyleCheesePizza();
            case "clam" -> new NYStyleClamPizza();
            default -> new NYStyleCheesePizza();
        };
    }
}
