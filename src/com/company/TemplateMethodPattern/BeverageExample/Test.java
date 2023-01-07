package com.company.TemplateMethodPattern.BeverageExample;

public class Test
{
    public static void main(String[] args)
    {
        var coffee = new Coffee();
        coffee.prepare();

        System.out.println("------------------");

        var tea = new Tea();
        tea.prepare();

    }
}
