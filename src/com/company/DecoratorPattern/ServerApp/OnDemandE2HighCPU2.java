package com.company.DecoratorPattern.ServerApp;

@SuppressWarnings("all")
class OnDemandE2HighCPU2 extends Server
{
    private final String NAME = "OD-E2-HighCPU-2";
    private final double price =  0.049468;
    public OnDemandE2HighCPU2() {
        name = NAME;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
