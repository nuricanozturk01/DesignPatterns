package com.company.AdapterPattern.Duck;

class Test
{
    public static void main(String[] args)
    {
        var mallardDuck = new MallardDuck();
        var wildTurkey = new WildTurkey();
        var adapter = new TurkeyAdapter(wildTurkey);

        System.out.println("The Turkey says...");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("-----------------------");
        System.out.println("The Duck Says...");
        mallardDuck.fly();
        mallardDuck.quack();

        System.out.println("-----------------------");
        System.out.println("Turkey Adapter...");
        adapter.fly();
        adapter.quack();
    }
}
