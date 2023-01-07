package com.company.TemplateMethodPattern.BeverageExample;

import java.util.Scanner;

public class Keyboard
{
    private static Scanner m_scanner = new Scanner(System.in);
    private Keyboard(){}
    public static Scanner getKeyboard()
    {
        return m_scanner == null ? new Scanner(System.in) : m_scanner;
    }
}
