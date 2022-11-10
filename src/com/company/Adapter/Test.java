package com.company.Adapter;

public class Test
{
    public static void main(String[] args) {
        var duck = new MallarDuck();
        var turkey = new WildTurkey();
        var adapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey says....");
        adapter.quack();
        adapter.fly();
    }
}
