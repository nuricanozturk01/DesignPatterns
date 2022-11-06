package com.company.StrategyPattern.Hero.Attack;


import com.company.StrategyPattern.Hero.Hero.Hero;
import com.company.StrategyPattern.Hero.IHeroAttackType;

public class Melee implements IHeroAttackType {

    private final int DAMAGE = 30;
    @Override
    public void attack(Hero target)
    {
        target.setHP(target.getHP() - DAMAGE);
    }
}
