package com.company.TemplateMethodPattern.BeverageExample;

import static com.company.TemplateMethodPattern.BeverageExample.Keyboard.getKeyboard;

public class Tea extends CaffeineBeverage{
    @Override
    protected void brew()
    {
        System.out.println("Stepping the tea");
    }

    @Override
    protected void addCondiments()
    {
        System.out.println("Adding Lemon");
    }

    @Override
    protected boolean isCustomerWantCondiments()
    {
        System.out.println("Do you want to lemon with your tea?(y/n)");

        var kb = getKeyboard();
        var answer = kb.nextLine();

        return answer.startsWith("y");
    }
}
