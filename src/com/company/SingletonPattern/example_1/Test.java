package com.company.SingletonPattern.example_1;

import static com.company.SingletonPattern.example_1.Sample.*;
class Test
{
    public static void main(String[] args)
    {
        var obj1 = createObject();
        var obj2 = createObject();
        var obj3 = createObject();

        obj1.setData(32);

        System.out.println("Obj1: " + obj1.getData());
        System.out.println("Obj2: " + obj2.getData());
        System.out.println("Obj3: " + obj3.getData());

        obj1.setData(42);

        System.out.println("Obj1: " + obj1.getData());
        System.out.println("Obj2: " + obj2.getData());
        System.out.println("Obj3: " + obj3.getData());
    }
}
