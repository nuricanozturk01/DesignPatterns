package com.company.StrategyPattern.Hero.Attack;


import com.company.StrategyPattern.Hero.Hero.Hero;
import com.company.StrategyPattern.Hero.IHeroAttackType;

import java.util.Random;

public class Magic implements IHeroAttackType
{
    @Override
    public void attack(Hero target)
    {
        Random random = new Random();

        target.setHP(target.getHP() - (random.nextInt(100 - 1) + 1 >= 20 ? 40 : 0));
    }
}
