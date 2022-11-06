package com.company.abstractFactory.AbstarctFactoryPizza.Pizza;

import com.company.abstractFactory.AbstarctFactoryPizza.Cheese.Cheese;
import com.company.abstractFactory.AbstarctFactoryPizza.Clams.Clam;
import com.company.abstractFactory.AbstarctFactoryPizza.Dough.Dough;
import com.company.abstractFactory.AbstarctFactoryPizza.Pepperoni.Pepperoni;
import com.company.abstractFactory.AbstarctFactoryPizza.Sauce.Sauce;
import com.company.abstractFactory.AbstarctFactoryPizza.Veggies.Veggies;

public abstract class Pizza
{
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies veggies[];
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clam clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }
    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

}
