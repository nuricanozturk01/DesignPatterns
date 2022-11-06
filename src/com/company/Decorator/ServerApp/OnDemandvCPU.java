package com.company.Decorator.ServerApp;




@SuppressWarnings("all")
class OnDemandvCPU extends Decorator
{
    private final String NAME = "OD-vCPU";
    private final double cost =  0.022890;
    public OnDemandvCPU(Server server)
    {
        super(server);
        name = NAME;
    }
    @Override
    public double getPrice() {
        return server.getPrice() + cost;
    }
}
