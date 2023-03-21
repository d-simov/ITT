package Lesson15ClassesAndObjects.StreetJavaFighter_advanced;

import java.util.Random;

public class Fighter {

    String name;
    private int level = 1;
    private int totalExperience = 0;
    private int maxHitPoints;
    private int currentHitPoints;
    private int minDamage;
    private int maxDamage;
    private int totalDamageCaused;
    private int criticalHitChance;
    private int dodgeChance;
    private int blockChance;

    public Fighter(String name, int hitPoints, int minDamage, int maxDamage) {
        this.name = name;
        if (hitPoints > 0 && hitPoints < 100) {
            this.maxHitPoints = hitPoints;
            this.currentHitPoints = this.maxHitPoints;
        }
        if (minDamage > 0 && minDamage <= 5) {
            this.minDamage = minDamage;
        }
        if (maxDamage > 5 && maxDamage <= 10) {
            this.maxDamage = maxDamage;
        }

    }

    public void setCriticalDodgeBlock(int criticalHitChance, int dodgeChance, int blockChance) {
        if (criticalHitChance > 0 && dodgeChance > 0 && blockChance > 0 && criticalHitChance < 100 && dodgeChance < 100 && blockChance < 100) {
            this.criticalHitChance = criticalHitChance;
            this.dodgeChance = dodgeChance;
            this.blockChance = blockChance;
        }
    }

    void hits(Fighter enemy) {
        int chance1 = new Random().nextInt(100);
        int damagePoints = (int) (Math.floor(Math.random() * ((maxDamage + level) - (minDamage + level) + 1)) + minDamage + level);
        if (chance1 < criticalHitChance) {
            enemy.currentHitPoints -= damagePoints * 2;
            totalDamageCaused += damagePoints * 2;
            totalExperience += (totalDamageCaused / 10);
            System.out.println(this.name + " hits " + enemy.name + " for CRITICAL DAMAGE with " + damagePoints * 2 + " dmg. " + enemy.name + " now has " + enemy.currentHitPoints + " hp left.");
        }
        else {
            int chance2 = new Random().nextInt(100);
            if (chance2 < enemy.dodgeChance) {
                System.out.println(this.name + " hits " + enemy.name + " and MISSES. " + enemy.name + " has " + enemy.currentHitPoints + " hp left.");
            } else {
                if (chance2 < enemy.blockChance) {
                    enemy.currentHitPoints -= damagePoints / 2;
                    totalDamageCaused += damagePoints / 2;
                    totalExperience += (totalDamageCaused / 10);
                    System.out.println(this.name + " hits " + enemy.name + " for " + damagePoints / 2 + " dmg for " + enemy.name + " BLOCKS and now has " + enemy.currentHitPoints + " hp left.");
                } else {
                    enemy.currentHitPoints -= damagePoints;
                    totalDamageCaused += damagePoints;
                    totalExperience += (totalDamageCaused / 15);
                    System.out.println(this.name + " hits " + enemy.name + " for " + damagePoints + " dmg. " + enemy.name + " has " + enemy.currentHitPoints + " hp left.");
                }
            }
        }
        if (totalExperience > 50000 && level < 5) {
            levelUp();
        }
        else if (totalExperience > 15000 && level < 4) {
            levelUp();
        }
        else if (totalExperience > 2500 && level < 3) {
            levelUp();
        }
        else if (totalExperience > 750 && level < 2) {
            levelUp();
        }


    }

    private void levelUp() {
        level++;
        System.out.println("\n" + name + " IS NOW LEVEL " + level + ".");
        System.out.println(name + "DAMAGE NOW VARIES FROM " + (minDamage + level) + " to " + (maxDamage + level) + ".\n");
    }


    boolean isDefeated(){
        return currentHitPoints <= 15;
    }

    public void revive() {
        currentHitPoints = maxHitPoints;
    }

    public int getTotalExperience() {
        return totalExperience;
    }
}

