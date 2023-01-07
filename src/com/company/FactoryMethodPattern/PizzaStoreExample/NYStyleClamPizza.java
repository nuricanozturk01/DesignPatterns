package com.company.FactoryMethodPattern.PizzaStoreExample;

public class NYStyleClamPizza extends Pizza {

    public NYStyleClamPizza()
    {
        setName("NYStyle Clam Pizza");
        setDough("Another Dough");
        setSauce("Other Sauce");

        addTopping("topping 2");
    }
}
