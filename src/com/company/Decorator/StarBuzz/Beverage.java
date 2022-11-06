package com.company.Decorator.StarBuzz;

abstract class Beverage
{
    private String description;

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }

    public abstract double cost();

    @Override
    public String toString() {
        return getDescription() + " " + cost() + "$";
    }
}
