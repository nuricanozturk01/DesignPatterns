package com.company.abstractFactory.AbstarctFactoryPizza;

import com.company.abstractFactory.AbstarctFactoryPizza.Pizza.Pizza;

public class VeggiePizza extends Pizza {
    protected PizzaIngredientFactory factory;

    public VeggiePizza(PizzaIngredientFactory factory)
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
