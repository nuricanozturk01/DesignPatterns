package com.company.Adapter;

import java.util.stream.IntStream;

public class TurkeyAdapter implements Duck{

    private final Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        IntStream.range(0,5).forEach(i -> turkey.fly());
    }
}
