package com.company.AbstractFactoryPattern.PizzaStore.pizza;

import com.company.AbstractFactoryPattern.PizzaStore.Toppings.*;

public abstract class Pizza
{
    private String name;
    private ISauce sauce;
    private IDough dough;
    private IVeggies[] veggies;
    private ICheese cheese;
    private IPepperoni pepperoni;
    private IClams clams;

    public abstract void prepare();


    public void bake() {
        System.out.println("Bake...");
    }
    public void cut() {
        System.out.println("Cutting...");
    }
    public void box() {
        System.out.println("Boxing...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
