package com.company.TemplatePattern;

public class Item
{
    private final String m_itemName;
    private final double m_price;

    public Item(String m_itemName, double m_price)
    {
        this.m_itemName = m_itemName;
        this.m_price = m_price;
    }

    public String getItemName() {
        return m_itemName;
    }

    public double getPrice() {
        return m_price;
    }


}
