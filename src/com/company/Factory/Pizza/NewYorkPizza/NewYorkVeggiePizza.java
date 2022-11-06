package com.company.Factory.Pizza.NewYorkPizza;

import com.company.Factory.Pizza.Pizza;
import com.company.Factory.Pizza.types.DoughType;
import com.company.Factory.Pizza.types.Sauce;
import com.company.Factory.Pizza.types.Topping;
public class NewYorkVeggiePizza extends Pizza
{
    public NewYorkVeggiePizza()
    {
        setName("NewYork Style Veggie Pizza");
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
