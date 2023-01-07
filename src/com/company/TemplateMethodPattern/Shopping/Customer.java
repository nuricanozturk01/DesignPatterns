package com.company.TemplateMethodPattern.Shopping;

import java.util.ArrayList;
import java.util.List;
public class Customer
{
    private final String m_firstName;
    private final String m_lastName;
    private final List<Item> m_listOfItem;
    private OrderProcessTemplate m_orderType;

    public Customer(String m_firstName, String m_lastName)
    {
        this.m_firstName = m_firstName;
        this.m_lastName = m_lastName;
        m_listOfItem = new ArrayList<>();
    }


    public String getFirstName() {
        return m_firstName;
    }

    public String getLastName() {
        return m_lastName;
    }

    public List<Item> getListOfItem() {
        return m_listOfItem;
    }

    public OrderProcessTemplate getOrderType() {
        return m_orderType;
    }

    public void setOrderType(OrderProcessTemplate m_orderType) {
        this.m_orderType = m_orderType;
    }

    public void addItem(Item item) {
        m_listOfItem.add(item);
    }


}
