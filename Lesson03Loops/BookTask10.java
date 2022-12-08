package Lesson03Loops;

import java.util.Scanner;

public class BookTask10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cardNumber;
        do {
            System.out.println("Please, enter a card number from 1 to 52:");
            cardNumber = sc.nextInt();
        } while (cardNumber < 1 || cardNumber > 52);

        for (int currentCard = cardNumber - 1; currentCard < 52; currentCard++) {
            int cardNameAsNumber = currentCard / 4;
            int cardPaintAsNumber = currentCard % 4;
            String cardName = "";
            String cardPaint = "";

            switch (cardNameAsNumber) {
                case 0 -> cardName = "Двойка";
                case 1 -> cardName = "Тройка";
                case 2 -> cardName = "Четворка";
                case 3 -> cardName = "Петица";
                case 4 -> cardName = "Шестица";
                case 5 -> cardName = "Седмица";
                case 6 -> cardName = "Осмица";
                case 7 -> cardName = "Девятка";
                case 8 -> cardName = "Десятка";
                case 9 -> cardName = "Вале";
                case 10 -> cardName = "Дама";
                case 11 -> cardName = "Поп";
                case 12 -> cardName = "Асо";
                default -> System.out.print(" Not a valid card number, ");
            }
            switch (cardPaintAsNumber) {
                case 0 -> cardPaint = "Спатия";
                case 1 -> cardPaint = "Каро";
                case 2 -> cardPaint = "Купа";
                case 3 -> cardPaint = "Пика";
            }

            if (currentCard < 51) {
                System.out.print(cardName + " " + cardPaint + ", ");
            }
            else {
                System.out.print(cardName + " " + cardPaint + ".");
            }

        }

    }

}
