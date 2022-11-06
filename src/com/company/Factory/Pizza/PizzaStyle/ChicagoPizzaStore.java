package com.company.Factory.Pizza.PizzaStyle;


import com.company.Factory.Pizza.ChicagoPizza.ChicagoCheesePizza;
import com.company.Factory.Pizza.ChicagoPizza.ChicagoClamPizza;
import com.company.Factory.Pizza.ChicagoPizza.ChicagoPepperoniPizza;
import com.company.Factory.Pizza.ChicagoPizza.ChicagoVeggiePizza;
import com.company.Factory.Pizza.Pizza;
import com.company.Factory.Pizza.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore
{

    @Override
    protected Pizza createPizza(String type)
    {
        if (type.compareToIgnoreCase("cheese") == 0)
            return new ChicagoCheesePizza();
        if (type.compareToIgnoreCase("veggie") == 0)
            return new ChicagoVeggiePizza();
        if (type.compareToIgnoreCase("clam") == 0)
            return new ChicagoClamPizza();

        return new ChicagoPepperoniPizza();
    }
}
