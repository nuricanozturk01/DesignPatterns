package com.company.DecoratorPattern.ServerApp;


@SuppressWarnings("all")
class PreEmptibleMemory extends Decorator
{
    private final String NAME = "PE-Memory";
    private final double cost = 0.000920;
    public PreEmptibleMemory(Server server)
    {
        super(server);
        name = NAME;
    }
    @Override
    public double getPrice() {
        return server.getPrice() + cost;
    }
}
