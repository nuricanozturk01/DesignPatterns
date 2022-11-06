package com.company.Factory.Pizza.NewYorkPizza;


import com.company.Factory.Pizza.Pizza;
import com.company.Factory.Pizza.types.DoughType;
import com.company.Factory.Pizza.types.Sauce;
import com.company.Factory.Pizza.types.Topping;

public class NewYorkCheesePizza extends Pizza
{
    public NewYorkCheesePizza()
    {
        setName("NewYork Style Deep Dish Cheese Pizza");
        setDough(DoughType.ExtraThickCrustDough);
        setSauce(Sauce.MarinaraSauce);
        getToppings().add(Topping.ShreddedMozzarellaCheese);
    }


    @Override
    public void cutting()
    {
        System.out.println("Cutting the pizza into square slices");
    }
}
