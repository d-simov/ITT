package Lesson15ClassesAndObjects.StreetJavaFighter_advanced;

import java.util.Random;
import java.util.Scanner;

public class Combat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter a name for fighter 1: ");
        String f1Name = sc.nextLine();
        System.out.print("Please, enter a name for fighter 2: ");
        String f2Name = sc.nextLine();

        Fighter fighter1 = new Fighter(f1Name, 70, 3, 5, 60);
        Fighter fighter2 = new Fighter(f2Name, 90, 4, 8, 30);
        fighter1.setCriticalDodgeBlock(25, 35, 45);
        fighter2.setCriticalDodgeBlock(10, 5, 55);

        int roundsNumber = enterRoundsNumber(sc);

        int fighter1Wins = 0;
        int fighter2Wins = 0;

        for (int i = 0; i < roundsNumber; i++) {
            fighter1.revive();
            fighter2.revive();

            while (true) {
                if (fighter1.isDefeated()) {
                    System.out.println(fighter1.getName() + " is defeated. " + fighter2.getName() + " WINS!");
                    fighter2Wins++;
                }
                if (fighter2.isDefeated()) {
                    System.out.println(fighter2.getName() + " is defeated. " + fighter1.getName() + " WINS!");
                    fighter1Wins++;
                }
                if (fighter1.isDefeated() || fighter2.isDefeated()) {
                    System.out.println("At the end of this round " + fighter1.getName() + " has " + fighter1.getTotalExperience() + " experience. " + fighter2.getName() + " has " + fighter2.getTotalExperience() + " experience.\n");
                    break;
                }
                if (new Random().nextBoolean()) {
                    if (!fighter1.isDefeated()) {
                        fighter1.hits(fighter2);
                    }
                    if (!fighter2.isDefeated()) {
                        fighter2.hits(fighter1);
                    }
                } else {
                    if (!fighter2.isDefeated()) {
                        fighter2.hits(fighter1);
                    }
                    if (!fighter1.isDefeated()) {
                        fighter1.hits(fighter2);
                    }
                }
            }
        }

        String winner = fighter1.getName();
        if (fighter2Wins > fighter1Wins) {
            winner = fighter2.getName();
        }

        if (fighter1Wins == fighter2Wins) {
            System.out.println("There is no champion yet. They need to fight again.");
        }
        else {
            System.out.println("The tournament is over and " + winner + " is the new champion!");
        }

        System.out.println(fighter1.getName() + " won " + fighter1Wins + " times.");
        System.out.println(fighter2.getName() + " won " + fighter2Wins + " times.");
        System.out.println("At the end of the tournament:");
        System.out.println(" - " + fighter1.getName() + " is level " + fighter1.getLevel() + " with " + fighter1.getTotalExperience() + " gained experience.");
        System.out.println(" - " + fighter2.getName() + " is level " + fighter2.getLevel() + " with " + fighter2.getTotalExperience() + " gained experience.");
    }

    static int enterRoundsNumber (Scanner sc) {
        int times;
        do {
            System.out.print("How many time do you want them to fight? ");
            times = sc.nextInt();
        } while (times <= 0);
        return times;
    }

}
