package com.company.FactoryMethodPattern.PizzaStoreExample;

public class NYStyleCheesePizza extends Pizza
{
    public NYStyleCheesePizza()
    {
        setName("NYStyle Cheese Pizza");
        setDough("Thin Crust Dough");
        setSauce("Marinara Sauce");
        addTopping("topping");
    }
}
