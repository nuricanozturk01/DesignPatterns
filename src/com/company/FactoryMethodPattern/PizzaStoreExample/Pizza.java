package com.company.FactoryMethodPattern.PizzaStoreExample;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza
{
    private String name;
    private String dough;
    private String sauce;

    private List<String> toppings = new ArrayList<>();

    void prepare()
    {
        System.out.println("Preparing " + name);
        System.out.println("Tossing Dough");
        System.out.println("Adding Sauce");
        System.out.println("Adding toppings");

        for (var topping: toppings)
            System.out.println("    -> " + topping);
    }

    public void bake() {
        System.out.println("Pizza in the bake");
    }

    public void cut() {
        System.out.println("Pizza cutting...");
    }

    public void box() {
        System.out.println("Pizza boxing...");
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }
}
