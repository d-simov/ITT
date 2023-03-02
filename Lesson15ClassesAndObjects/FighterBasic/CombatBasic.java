package Task02FighterBasic;

import java.util.Random;

public class CombatBasic {

    public static void main(String[] args) {
        FighterBasic subZero = new FighterBasic();
        subZero.name = "Sub Zero";
        subZero.maxHealth = 115;
        subZero.lifePoints = subZero.maxHealth;
        subZero.damage = 8;

        FighterBasic sonya = new FighterBasic();
        sonya.name = "Sonya";
        sonya.maxHealth = 90;
        sonya.lifePoints = sonya.maxHealth;
        sonya.damage = 5;

        int numberOfBattles = 100;
        int subZeroWins = 0;
        int sonyaWins = 0;

        for (int i = 0; i < numberOfBattles; i++) {
            subZero.lifePoints = subZero.maxHealth;
            sonya.lifePoints = sonya.maxHealth;
            while (true) {
                if (!subZero.isAlive()) {
                    System.out.println(sonya.name + " wins.");
                    sonyaWins++;
                    break;
                }
                if (!sonya.isAlive()) {
                    System.out.println(subZero.name + " wins.");
                    subZeroWins++;
                    break;
                }
                if (new Random().nextBoolean()){
                    if (subZero.isAlive()) {
                        subZero.hit(sonya);
                    }
                    if (sonya.isAlive()) {
                        sonya.hit(subZero);
                        sonya.hit(subZero);
                    }
                }
                else {
                    if (sonya.isAlive()) {
                        sonya.hit(subZero);
                        sonya.hit(subZero);
                    }
                    if (subZero.isAlive()) {
                        subZero.hit(sonya);
                    }

                }
            }
        }

        System.out.println(sonya.name + " wins: " + sonyaWins);
        System.out.println(subZero.name + " wins " + subZeroWins);
    }


}
