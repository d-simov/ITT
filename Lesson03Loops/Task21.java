package Lesson03Loops;

import java.util.Scanner;

public class Task21 {

    public static void main(String[] args) {

        System.out.println("Моля, въведете пореден номер на картата за игра [1:52]:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int cardNumber = number; cardNumber <= 52; cardNumber++) {
           int name = (cardNumber - 1) / 4;
           int paint = (cardNumber - 1) % 4;
           String cardName = "";
           String cardPaint = "";
            switch (name) {
                case 0 -> cardName = ("Двойка");
                case 1 -> cardName = ("Тройка");
                case 2 -> cardName = ("Четворка");
                case 3 -> cardName = ("Петица");
                case 4 -> cardName = ("Шестица");
                case 5 -> cardName = ("Седмица");
                case 6 -> cardName = ("Осмица");
                case 7 -> cardName = ("Девятка");
                case 8 -> cardName = ("Десятка");
                case 9 -> cardName = ("Вале");
                case 10 -> cardName = ("Дама");
                case 11 -> cardName = ("Поп");
                case 12 -> cardName = ("Асо");
            }
            switch (paint) {
                case 0 -> cardPaint = ("Спатия");
                case 1 -> cardPaint = ("Каро");
                case 2 -> cardPaint = ("Купа");
                case 3 -> cardPaint = ("Пика");
            }
            if (cardNumber < 52){
                System.out.print(cardName + " " + cardPaint + ", ");
            }
            else {
                System.out.print(cardName + " " + cardPaint + ".");
            }
        }



    }
}
