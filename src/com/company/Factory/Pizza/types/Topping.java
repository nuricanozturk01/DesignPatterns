package com.company.Factory.Pizza.types;

public enum Topping
{
    TexMex(1), Margherita(2), GratedReggianoCheese(3), ShreddedMozzarellaCheese(4);

    private final int number;

    Topping(int number)
    {
        this.number = number;
    }


    @Override
    public String toString()
    {
        return switch (number)
                {
                    case 1 -> "Tex Mex";
                    case 2 -> "Margherita";
                    case 3 -> "Grated Reggiano Cheese";
                    case 4 -> "Shredded Mozzarella Cheese";

                    default -> throw new IllegalStateException("Unexpected value: " + number);
                };
    }
}
