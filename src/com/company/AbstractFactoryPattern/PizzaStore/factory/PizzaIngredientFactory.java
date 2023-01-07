package com.company.AbstractFactoryPattern.PizzaStore.factory;

import com.company.AbstractFactoryPattern.PizzaStore.Toppings.*;

public interface PizzaIngredientFactory
{
    IDough createDough();
    ISauce createSauce();
    ICheese createCheese();
    IVeggies[] createVeggies();
    IPepperoni createPepperoni();
    IClams createClams();
}
