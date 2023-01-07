package com.company.DecoratorPattern.ServerApp;



@SuppressWarnings("all")
class OnDemandMemory extends Decorator
{
    private final String NAME = "OD-Memory";
    private final double cost = 0.003067;
    public OnDemandMemory(Server server)
    {
        super(server);
        name = NAME;
    }
    @Override
    public double getPrice() {
        return server.getPrice() + cost;
    }
}
