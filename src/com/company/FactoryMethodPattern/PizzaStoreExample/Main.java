package com.company.FactoryMethodPattern.PizzaStoreExample;

public class Main
{
    public static void main(String[] args) {
        PizzaStore store = new NYPizzaStore();
        Pizza pizza = store.orderPizza("cheese");
        System.out.println("Pizza: " + pizza.getName());
    }
}
