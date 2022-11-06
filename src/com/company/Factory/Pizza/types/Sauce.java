package com.company.Factory.Pizza.types;

public enum Sauce
{
    MarinaraSauce(0), PlumTomatoSauce(1);

    private final int number;

    Sauce(int number)
    {
        this.number = number;
    }



    public String toString(int number)
    {
        return switch (number)
                {
                    case 0 -> "Marinara Sauce";
                    case 1 -> "Plum Tomato Sauce";

                    default -> throw new IllegalStateException("Unexpected value: " + number);
                };
    }

}
