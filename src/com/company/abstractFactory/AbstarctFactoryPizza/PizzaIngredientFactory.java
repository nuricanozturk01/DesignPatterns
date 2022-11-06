package com.company.abstractFactory.AbstarctFactoryPizza;

import com.company.abstractFactory.AbstarctFactoryPizza.Cheese.Cheese;
import com.company.abstractFactory.AbstarctFactoryPizza.Clams.Clam;
import com.company.abstractFactory.AbstarctFactoryPizza.Dough.Dough;
import com.company.abstractFactory.AbstarctFactoryPizza.Pepperoni.Pepperoni;
import com.company.abstractFactory.AbstarctFactoryPizza.Sauce.Sauce;
import com.company.abstractFactory.AbstarctFactoryPizza.Veggies.Veggies;

public interface PizzaIngredientFactory
{
    Cheese createCheese();
    Clam createClam();
    Dough createDough();
    Pepperoni createPepperoni();
    Veggies[] createVeggies();
    Sauce createSauce();
}
