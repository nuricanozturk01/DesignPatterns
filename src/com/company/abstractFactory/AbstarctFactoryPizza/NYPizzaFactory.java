package com.company.abstractFactory.AbstarctFactoryPizza;

import com.company.abstractFactory.AbstarctFactoryPizza.Cheese.Cheese;
import com.company.abstractFactory.AbstarctFactoryPizza.Cheese.MozzarellaCheese;
import com.company.abstractFactory.AbstarctFactoryPizza.Clams.Clam;
import com.company.abstractFactory.AbstarctFactoryPizza.Clams.FreshClams;
import com.company.abstractFactory.AbstarctFactoryPizza.Dough.Dough;
import com.company.abstractFactory.AbstarctFactoryPizza.Dough.ThickCrustDough;
import com.company.abstractFactory.AbstarctFactoryPizza.Pepperoni.Pepperoni;
import com.company.abstractFactory.AbstarctFactoryPizza.Pepperoni.SlicedPepperoni;
import com.company.abstractFactory.AbstarctFactoryPizza.Sauce.MarinaraSauce;
import com.company.abstractFactory.AbstarctFactoryPizza.Sauce.Sauce;
import com.company.abstractFactory.AbstarctFactoryPizza.Veggies.Garlic;
import com.company.abstractFactory.AbstarctFactoryPizza.Veggies.Mushroom;
import com.company.abstractFactory.AbstarctFactoryPizza.Veggies.Onion;
import com.company.abstractFactory.AbstarctFactoryPizza.Veggies.Veggies;

public class NYPizzaFactory implements PizzaIngredientFactory
{


    @Override
    public Cheese createCheese()
    {
        return new MozzarellaCheese();
    }

    @Override
    public Clam createClam() {
        return new FreshClams();
    }

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[] {new Onion(), new Garlic(), new Mushroom()};
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
}
