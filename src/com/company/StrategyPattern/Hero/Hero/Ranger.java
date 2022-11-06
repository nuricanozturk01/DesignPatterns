package com.company.StrategyPattern.Hero.Hero;


import com.company.StrategyPattern.Hero.Attack.Ranged;

public class Ranger extends Hero
{
    public Ranger(String name)
    {
        super(new Ranged());
        setHeroName(name);
    }


    @Override
    public void display() {
        System.out.println("-------------------------------------------");
        System.out.println("Hero Name: " + getHeroName());
        System.out.println("Hero Class: " + super.getClass().getSimpleName());
        System.out.println("Attack Type: " + getHeroAttackTypeString());
        System.out.println("Current HP: " + getHP());
        System.out.println("-------------------------------------------");
    }
}
