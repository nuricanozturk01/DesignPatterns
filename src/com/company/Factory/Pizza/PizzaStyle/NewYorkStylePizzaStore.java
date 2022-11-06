package com.company.Factory.Pizza.PizzaStyle;


import com.company.Factory.Pizza.NewYorkPizza.NewYorkCheesePizza;
import com.company.Factory.Pizza.NewYorkPizza.NewYorkClamPizza;
import com.company.Factory.Pizza.NewYorkPizza.NewYorkPepperoniPizza;
import com.company.Factory.Pizza.NewYorkPizza.NewYorkVeggiePizza;
import com.company.Factory.Pizza.Pizza;
import com.company.Factory.Pizza.PizzaStore;

public class NewYorkStylePizzaStore extends PizzaStore
{

    @Override
    protected Pizza createPizza(String type) {
        if (type.compareToIgnoreCase("cheese") == 0)
            return new NewYorkCheesePizza();
        if (type.compareToIgnoreCase("veggie") == 0)
            return new NewYorkVeggiePizza();
        if (type.compareToIgnoreCase("clam") == 0)
            return new NewYorkClamPizza();

        return new NewYorkPepperoniPizza();
    }
}
