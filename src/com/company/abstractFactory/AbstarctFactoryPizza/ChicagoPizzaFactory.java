package com.company.abstractFactory.AbstarctFactoryPizza;

import com.company.abstractFactory.AbstarctFactoryPizza.Cheese.Cheese;
import com.company.abstractFactory.AbstarctFactoryPizza.Clams.Clam;
import com.company.abstractFactory.AbstarctFactoryPizza.Dough.Dough;
import com.company.abstractFactory.AbstarctFactoryPizza.Pepperoni.Pepperoni;
import com.company.abstractFactory.AbstarctFactoryPizza.Sauce.Sauce;
import com.company.abstractFactory.AbstarctFactoryPizza.Veggies.Veggies;

public class ChicagoPizzaFactory implements PizzaIngredientFactory
{
    

    @Override
    public Cheese createCheese() {
        return null;
    }

    @Override
    public Clam createClam() {
        return null;
    }

    @Override
    public Dough createDough() {
        return null;
    }

    @Override
    public Pepperoni createPepperoni() {
        return null;
    }

    @Override
    public Veggies[] createVeggies() {
        return null;
    }

    @Override
    public Sauce createSauce() {
        return null;
    }
}
