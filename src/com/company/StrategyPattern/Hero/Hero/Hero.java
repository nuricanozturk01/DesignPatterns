package com.company.StrategyPattern.Hero.Hero;


import com.company.StrategyPattern.Hero.IHeroAttackType;

public abstract class Hero {

    private String heroName;
    private int HP = 100;
    private IHeroAttackType heroAttackType;

    public Hero(IHeroAttackType heroAttackType) {
        this.heroAttackType = heroAttackType;
    }

    public void performAttack(Hero target) {

        if(target.getHP()<=0){
            System.out.println("It's already dead");
            return;
        }

        this.heroAttackType.attack(target);
    }

    public abstract void display();

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public IHeroAttackType getHeroAttackType() {
        return heroAttackType;
    }

    public String getHeroAttackTypeString()
    {
        return heroAttackType.getClass().getSimpleName();
    }
}
