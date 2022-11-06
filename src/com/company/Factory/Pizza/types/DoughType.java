package com.company.Factory.Pizza.types;

public enum DoughType
{
    ThinCrustDough(1), ExtraThickCrustDough(2);

    private final int number;
    DoughType(int number)
    {
        this.number = number;
    }

    public static String getString(int number)
    {
        switch (number)
        {
            case 2 : return "Extra Thick Crust Dough";
            default: return "Thin Crust Dough";
        }
    }
}
