package com.company.DecoratorPattern.BeverageExample;

public class Main
{
    public static void main(String[] args) {
        Beverage filterCoffee = new FilterCoffe();
        filterCoffee = new Mocha(filterCoffee);
        filterCoffee = new Milk(filterCoffee);

        System.out.println(filterCoffee.getDescription());
        System.out.println(filterCoffee.cost());
    }
}
