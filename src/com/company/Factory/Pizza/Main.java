package com.company.Factory.Pizza;


import com.company.Factory.Pizza.PizzaStyle.ChicagoPizzaStore;

public class Main
{
    public static void main(String[] args)
    {
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza pizza = chicagoStore.orderPizza("cheese");
        System.out.println("\nNuri ordered a " + pizza.getName());


        System.out.println("-----------------------------------------------------------");

        PizzaStore newYorkStore = new ChicagoPizzaStore();
        pizza = newYorkStore.orderPizza("cheese");
        System.out.println("\nCan ordered a " + pizza.getName());



    }
}
