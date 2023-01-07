package com.company.AbstractFactoryPattern.PizzaStore.pizza;

import com.company.AbstractFactoryPattern.PizzaStore.factory.PizzaIngredientFactory;

public class ClamPizza extends Pizza{

    private final PizzaIngredientFactory factory;

    public ClamPizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getName() + "....");
        factory.createCheese();
        factory.createClams();
        factory.createDough();
        factory.createSauce();
        factory.createVeggies();
        factory.createPepperoni();
    }
}
