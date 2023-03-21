package Lesson15ClassesAndObjects.StreetJavaFighter_advanced;

import java.util.Random;
import java.util.Scanner;

public class Combat {

    public static void main(String[] args) {

        Fighter sonya = new Fighter("Sonya", 75, 3, 6);
        Fighter subZero = new Fighter("Sub Zero", 90, 4, 7);
        sonya.setCriticalDodgeBlock(25, 35, 45);
        subZero.setCriticalDodgeBlock(10, 5, 55);

        Scanner sc = new Scanner(System.in);
        int roundsNumber = enterRoundsNumber(sc);

        int sonyaWins = 0;
        int subZeroWins = 0;

        for (int i = 0; i < roundsNumber; i++) {
            sonya.revive();
            subZero.revive();

            while (true) {
                if (sonya.isDefeated()) {
                    System.out.println(sonya.name + " is defeated. " + subZero.name + " WINS!");
                    System.out.println(sonya.name + " has " + sonya.getTotalExperience() + " experience. " + subZero.name + " has " + subZero.getTotalExperience() + " experience.\n");
                    subZeroWins++;
                    break;
                }
                if (subZero.isDefeated()) {
                    System.out.println(subZero.name + " is defeated. " + sonya.name + " WINS!");
                    System.out.println(sonya.name + " has " + sonya.getTotalExperience() + " experience. " + subZero.name + " has " + subZero.getTotalExperience() + " experience.\n");
                    sonyaWins++;
                    break;
                }
                if (new Random().nextBoolean()) {
                    if (!sonya.isDefeated()) {
                        sonya.hits(subZero);
                    }
                    if (!subZero.isDefeated()) {
                        subZero.hits(sonya);
                    }
                } else {
                    if (!subZero.isDefeated()) {
                        subZero.hits(sonya);
                    }
                    if (!sonya.isDefeated()) {
                        sonya.hits(subZero);
                    }
                }
            }
        }

        System.out.println(sonya.name + " won " + sonyaWins + " times.");
        System.out.println(subZero.name + " won " + subZeroWins + " times.");
    }

    static int enterRoundsNumber (Scanner sc) {
        int times;
        do {
            System.out.print("How many time do you want them to fight? ");
            times = sc.nextInt();
            if (times > 0) {
                break;
            }
        } while (times <= 0);
        return times;
    }

}
