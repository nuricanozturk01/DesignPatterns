package com.company.AdapterPattern.Duck;

import java.util.stream.IntStream;

public class WildTurkey implements Turkey
{
    @Override
    public void gobble() {
        System.out.println("gobble gobble");
    }

    @Override
    public void fly() {
        IntStream.range(0, 5).forEach(i -> System.out.println("Flying..."));
    }
}
