package com.company.Factory.Pizza;

import com.company.Factory.Pizza.types.*;
import java.util.ArrayList;
import java.util.List;

public abstract class Pizza
{
    private String name;
    private DoughType dough;
    private Sauce sauce;
    private final List<Topping> toppings = new ArrayList<>();
    public List<Topping> getToppings() {
        return toppings;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setDough(DoughType dough) {
        this.dough = dough;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public void prepare()
    {
        System.out.println("preparing: ");
        System.out.println(" - " + name);
        System.out.println("Adding sauce...");
        System.out.println(" - " + sauce.toString(sauce.ordinal()));
        System.out.println("Tossing dough...");
        System.out.println(" - " + DoughType.getString(dough.ordinal()));
        System.out.println("Adding toppings...");
        toppings.forEach(topping -> System.out.println(" - " + topping));
    }

    public void cooking()
    {
        System.out.println("Bake for 25 minutes at 350");
    }
    public void boxing()
    {
        System.out.println("Place pizza in official PizzaStore Box");
    }
    abstract public void cutting();
}
