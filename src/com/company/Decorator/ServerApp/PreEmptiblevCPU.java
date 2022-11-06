package com.company.Decorator.ServerApp;

@SuppressWarnings("all")
class PreEmptiblevCPU extends Decorator
{
    private final String NAME = "PE-vCPU";
    private final double cost = 0.006867;
    public PreEmptiblevCPU(Server server)
    {
        super(server);
        name = NAME;
    }
    @Override
    public double getPrice() {
        return server.getPrice() + cost;
    }
}
