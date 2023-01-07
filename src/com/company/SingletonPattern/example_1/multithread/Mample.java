package com.company.SingletonPattern.example_1.multithread;

public class Mample
{
    private static Mample m_mample;
    private int data;

    private Mample(){}

    public static Mample createObject()
    {
        synchronized (m_mample)
        {
            if (m_mample == null)
                return m_mample = new Mample();
        }

        return m_mample;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
