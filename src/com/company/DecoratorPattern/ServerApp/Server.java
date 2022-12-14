package com.company.DecoratorPattern.ServerApp;

abstract class Server
{
    protected String name;
    public String getDescription()
    {
        return name ;
    }
    public abstract double getPrice();
    @Override
    public String toString() {
        return getDescription();
    }
}
