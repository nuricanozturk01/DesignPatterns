package com.company.Factory.Pizza.ChicagoPizza;

import com.company.Factory.Pizza.Pizza;
import com.company.Factory.Pizza.types.DoughType;
import com.company.Factory.Pizza.types.Sauce;
import com.company.Factory.Pizza.types.Topping;

public class ChicagoPepperoniPizza extends Pizza
{
    public ChicagoPepperoniPizza()
    {
        setName("Chicago Style Pepperoni Pizza");
        setDough(DoughType.ThinCrustDough);
        setSauce(Sauce.PlumTomatoSauce);
        getToppings().add(Topping.GratedReggianoCheese);
    }


    @Override
    public void cutting()
    {
        System.out.println("Cutting the pizza into square slices");
    }
}
