package com.company.FacadePattern.Computer;

public class EverestKeyboard implements IKeyboard{
    @Override
    public void printInfo() {
        System.out.println("Everest Keyboard");
    }

    @Override
    public void printType() {
        System.out.println("English Q Keyboard");
    }
}
