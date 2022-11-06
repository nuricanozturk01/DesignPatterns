package com.company.abstractFactory.AbstarctFactoryPizza.Pizza;

import com.company.abstractFactory.AbstarctFactoryPizza.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza{
    protected PizzaIngredientFactory factory;

    public PepperoniPizza(PizzaIngredientFactory factory)
    {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = factory.createDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
        pepperoni = factory.createPepperoni();
        clam = factory.createClam();
        veggies = factory.createVeggies();
    }
}
