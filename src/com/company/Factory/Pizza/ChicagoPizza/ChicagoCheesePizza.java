package com.company.Factory.Pizza.ChicagoPizza;

import com.company.Factory.Pizza.Pizza;
import com.company.Factory.Pizza.types.DoughType;
import com.company.Factory.Pizza.types.Sauce;
import com.company.Factory.Pizza.types.Topping;

public class ChicagoCheesePizza extends Pizza
{
    public ChicagoCheesePizza()
    {
        setName("Chicago Style Cheese Pizza");
        setDough(DoughType.ThinCrustDough);
        setSauce(Sauce.PlumTomatoSauce);
        getToppings().add(Topping.GratedReggianoCheese);
    }


    @Override
    public void cutting()
    {
        System.out.println("Cutting the pizza into diagonal slices");
    }
}
