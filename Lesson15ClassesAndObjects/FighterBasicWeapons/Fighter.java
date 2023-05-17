package fighter;

import java.util.Random;

public class Fighter {

    private String name;
    private int healthPoints;
    private int damage;
    private Weapon weapon = Weapon.FISTS;
    private int hitSpeed = 0;
    boolean isAlive = true;

    Fighter (String name, int healthPoints, int damage){
        if (name.trim().length() > 1) {
            this.name = name;
        }
        else {
            this.name = "Fighter" + new Random(100);
        }
        if (healthPoints > 10 && healthPoints < 250) {
            this.healthPoints = healthPoints;
        }
        else {
            this.healthPoints = 100;
        }
        if (damage >= 1 && damage <= 5) {
            this.damage = damage;
        }
        else {
            this.damage = 3;
        }
    }

    void hit (Fighter enemy){
        for (int hitTimes = 0; hitTimes < this.defineFinalHitSpeed(); hitTimes++) {
            enemy.healthPoints -= this.defineFinalDamage();
        }
        System.out.println(this.name + " hits " + enemy.name + " " + this.defineFinalHitSpeed() + " times " +
                " with " + this.weapon + " for " + this.defineFinalDamage() + " damage each time.");
        System.out.println(enemy.name + " has " + enemy.healthPoints + " health points left.\n");
    }

    private int defineFinalDamage() {
        int finalDamage = 0;
        switch (this.weapon) {
            case FISTS -> {finalDamage = this.damage;}
            case KNIFE -> {finalDamage = this.damage + 4;}
            case SWORD -> {finalDamage = this.damage + 10;}
            case AXE -> {finalDamage =  this.damage + 30;}
        }
        return finalDamage;
    }

    private int defineFinalHitSpeed() {
        switch (this.weapon) {
            case FISTS -> {this.hitSpeed = 4;}
            case KNIFE -> {this.hitSpeed = 3;}
            case SWORD -> {this.hitSpeed = 2;}
            case AXE -> {this.hitSpeed = 1;}
        }
        return  this.hitSpeed;
    }

    void setWeapon (Weapon weapon) {
        this.weapon = weapon;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public String getName() {
        return name;
    }

    boolean isAlive() {
        return this.healthPoints >= 0;
    }
}
