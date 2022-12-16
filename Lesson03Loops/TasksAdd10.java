package Lesson03Loops;

import java.util.Scanner;

public class TasksAdd10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a card number from 1 to 52, including:");
        int cardNumber = sc.nextInt();

        if (cardNumber <= 0 || cardNumber > 52) {
            System.out.println("Invalid card number");
            return;
        }

        String cardName = "";
        char cardSuit = 0;

        switch ((cardNumber - 1) / 4) {
            case 0 -> cardName = "2";
            case 1 -> cardName = "3";
            case 2 -> cardName = "4";
            case 3 -> cardName = "5";
            case 4 -> cardName = "6";
            case 5 -> cardName = "7";
            case 6 -> cardName = "8";
            case 7 -> cardName = "9";
            case 8 -> cardName = "10";
            case 9 -> cardName = "Jack";
            case 10 -> cardName = "Queen";
            case 11 -> cardName = "King";
            case 12 -> cardName = "Ace";
        }
        switch ((cardNumber - 1) % 4) {
            case 0 -> cardSuit = '♣';
            case 1 -> cardSuit = '♦';
            case 2 -> cardSuit = '♥';
            case 3 -> cardSuit = '♠';
        }
        System.out.println("The card for your card number is " + cardName + " of " + cardSuit);

    }
}
