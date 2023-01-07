package com.company.SingletonPattern.example_1;

final class Sample
{
    private final static int DATA = 10;
    private static Sample sample;
    private int data;

    private Sample(int data)
    {
        this.data = data;
    }

    public static Sample createObject()
    {
        return sample = sample == null ? new Sample(DATA) : sample;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
