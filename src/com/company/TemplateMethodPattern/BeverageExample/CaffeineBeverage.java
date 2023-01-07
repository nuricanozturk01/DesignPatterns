package com.company.TemplateMethodPattern.BeverageExample;
abstract class CaffeineBeverage
{
    protected abstract void brew();
    protected abstract void addCondiments();

    public final void prepare()
    {
        boilWater();
        brew();
        pourInCup();

        if (isCustomerWantCondiments()) // Hook
            addCondiments();

        else System.out.println("No Condiments...");
    }

    protected boolean isCustomerWantCondiments()
    {
        return true;
    }
    private void boilWater()
    {
        System.out.println("Boiling water...");
    }

    private void pourInCup()
    {
        System.out.println("Pouring into cup...");
    }
}
