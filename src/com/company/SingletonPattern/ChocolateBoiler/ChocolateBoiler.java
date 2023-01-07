package com.company.SingletonPattern.ChocolateBoiler;

public class ChocolateBoiler
{
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler m_chocolateBoiler;

    private ChocolateBoiler()
    {
        empty = true;
        boiled = false;
    }


    public static ChocolateBoiler createObject()
    {
        return m_chocolateBoiler = m_chocolateBoiler == null ? new ChocolateBoiler() : m_chocolateBoiler;
    }


    public void drain()
    {
        empty = !empty && !boiled;
    }

    public void boil()
    {
        boiled = !empty && !boiled;
    }
}
