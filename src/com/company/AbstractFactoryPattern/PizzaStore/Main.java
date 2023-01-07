package com.company.AbstractFactoryPattern.PizzaStore;

import com.company.AbstractFactoryPattern.PizzaStore.Store.PizzaStoreChicago;
import com.company.AbstractFactoryPattern.PizzaStore.Store.PizzaStoreNY;

public class Main
{
    public static void main(String[] args) {
        var ny = new PizzaStoreNY();
        ny.orderPizza("cheese");
        System.out.println("------------------------------------");

        var chicago = new PizzaStoreChicago();
        chicago.orderPizza("clam");
    }
}
