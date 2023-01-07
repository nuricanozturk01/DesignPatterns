package com.company.DecoratorPattern.ServerApp;

abstract class Decorator extends Server
{
    protected Server server;

    public Decorator(Server server) {
        this.server = server;
    }

    @Override
    public String getDescription() {
        return server.getDescription() + ", " + name;
    }
}
