package Lesson03Loops;

import java.util.Scanner;

public class TasksAdd6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a suit (spades, diamonds, hearts of clubs):");
        String suit = sc.nextLine();

        switch (suit) {
            case "spades" -> System.out.println('♣');
            case "diamonds" -> System.out.println('♦');
            case "hearts" -> System.out.println('♥');
            case "clubs" -> System.out.println('♠');
            default -> System.out.println("Not a legal suit name.");
        }
    }
}
