package com.company.StatePattern.FinalQuestion;

public class NormalQuack implements IQuack{

    public NormalQuack() {
        quack();
    }

    @Override
    public void quack() {
        System.out.println("normal quack");
    }
}
