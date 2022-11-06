package com.company.Decorator.StarBuzz;

class Test
{
    public static void main(String[] args)
    {
        Beverage espresso = new Espresso();
        espresso = new Mocha(espresso);
        espresso = new Whipe(espresso);
        System.out.println(espresso);

        Beverage coldBrew = new ColdBrew();
        coldBrew = new Mocha(coldBrew);
        coldBrew = new Soy(coldBrew);
        System.out.println(coldBrew);
    }
}
