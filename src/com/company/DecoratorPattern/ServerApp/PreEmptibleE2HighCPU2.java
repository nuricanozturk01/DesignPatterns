package com.company.DecoratorPattern.ServerApp;
@SuppressWarnings("all")
class PreEmptibleE2HighCPU2 extends Server
{
    private final String NAME = "PRE-E2-HighCPU-2";
    private final double price = 0.01484;
    public PreEmptibleE2HighCPU2()
    {
        name = NAME;
    }
    @Override
    public double getPrice() {
        return price;
    }
}
