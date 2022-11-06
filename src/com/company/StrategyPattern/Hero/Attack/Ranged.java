package com.company.StrategyPattern.Hero.Attack;



import com.company.StrategyPattern.Hero.Hero.Hero;
import com.company.StrategyPattern.Hero.IHeroAttackType;

import java.util.Random;

public class Ranged implements IHeroAttackType {

    Random random = new Random();
    @Override
    public void attack(Hero target) {

        target.setHP(target.getHP() - (random.nextBoolean() ? 40 : 20));
    }
}
