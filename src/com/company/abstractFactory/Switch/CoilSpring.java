package com.company.abstractFactory.Switch;

public abstract class CoilSpring {

    int pressureCN;

    public CoilSpring(int pressureCN) {
        this.pressureCN = pressureCN;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "pressureCN=" + pressureCN +
                '}';
    }
}
