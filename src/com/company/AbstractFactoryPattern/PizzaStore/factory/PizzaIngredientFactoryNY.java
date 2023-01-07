package com.company.AbstractFactoryPattern.PizzaStore.factory;

import com.company.AbstractFactoryPattern.PizzaStore.Toppings.*;

public class PizzaIngredientFactoryNY implements PizzaIngredientFactory{
    @Override
    public IDough createDough() {
        return new DoughThickCrust();
    }

    @Override
    public ISauce createSauce() {
        return new SauceMarinara();
    }

    @Override
    public ICheese createCheese() {
        return new CheeseMozzarella();
    }

    @Override
    public IVeggies[] createVeggies() {
        return new IVeggies[]{new VeggieOnion(), new VeggieGarlic()};
    }

    @Override
    public IPepperoni createPepperoni() {
        return new PepperoniSliced();
    }

    @Override
    public IClams createClams() {
        return new ClamFresh();
    }
}
