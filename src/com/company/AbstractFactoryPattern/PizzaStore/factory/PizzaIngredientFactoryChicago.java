package com.company.AbstractFactoryPattern.PizzaStore.factory;

import com.company.AbstractFactoryPattern.PizzaStore.Toppings.*;

public class PizzaIngredientFactoryChicago implements PizzaIngredientFactory{
    @Override
    public IDough createDough() {
        return new DoughThinCrust();
    }

    @Override
    public ISauce createSauce() {
        return new SaucePlumTomato();
    }

    @Override
    public ICheese createCheese() {
        return new CheeseReggiano();
    }

    @Override
    public IVeggies[] createVeggies() {
        return new IVeggies[]{new VeggieGarlic()};
    }

    @Override
    public IPepperoni createPepperoni() {
        return new PepperoniSliced();
    }

    @Override
    public IClams createClams() {
        return new ClamFrozen();
    }
}
