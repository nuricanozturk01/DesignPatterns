package com.company.StrategyPattern.Hero;


import com.company.StrategyPattern.Hero.Hero.Hero;
import com.company.StrategyPattern.Hero.Hero.Mage;
import com.company.StrategyPattern.Hero.Hero.Ranger;
import com.company.StrategyPattern.Hero.Hero.Warrior;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static boolean isOneHeroRemaining(ArrayList<Hero> heroes) {
        int deathCount = 0;
        for (Hero hero :
                heroes) {
            if (hero.getHP() <= 0) {
                deathCount++;
            }
        }
        if (deathCount >= heroes.size() - 1) {
            return true;
        } else {
            return false;
        }
    }


    private static void declareWinner(ArrayList<Hero> heroes) {
        for (Hero hero :
                heroes) {
            if (hero.getHP() > 0) {
                System.out.println("Winner : " + hero.getHeroName() + "!!!");
            }
        }
    }

    public static void main(String[] args) {
        Warrior warrior = new Warrior("Leonidas");
        Ranger ranger = new Ranger("Legolas");
        Mage mage = new Mage("Lestrange");

        ArrayList<Hero> heroes = new ArrayList<>();
        heroes.add(warrior);
        heroes.add(ranger);
        heroes.add(mage);

        warrior.display();
        ranger.display();
        mage.display();

        Scanner scanner = new Scanner(System.in);
        while (!isOneHeroRemaining(heroes)) {
            System.out.println("Select a Hero to attack with:");
            for (int i = 0; i < heroes.size(); i++) {
                System.out.println((i + 1) + ". " + heroes.get(i).getHeroName());
            }
            int attackerIndex = scanner.nextInt();
            System.out.println("Select a Hero to attack:");
            for (int i = 0; i < heroes.size(); i++) {
                if (i + 1 == attackerIndex) {
                    continue;
                }
                System.out.println((i + 1) + ". " + heroes.get(i).getHeroName());
            }
            int defenderIndex = scanner.nextInt();
            Hero attacker = heroes.get(attackerIndex - 1);
            Hero defender = heroes.get(defenderIndex - 1);
            System.out.println(attacker.getHeroName() + " attacked " + defender.getHeroName());
            attacker.performAttack(defender);
            attacker.display();
            defender.display();
        }
        declareWinner(heroes);
    }
}
