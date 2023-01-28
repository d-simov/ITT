package Lesson08StringsAndMethods;

import java.util.Scanner;

public class BookTask06_Strings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter a string of symbols: ");
        String symbolString = sc.nextLine();
        System.out.print("Please, enter one character from the keyboard: ");
        char letter = sc.next().charAt(0);
        int counter = 0;

        for (int i = 0; i < symbolString.length(); i++) {
            if (symbolString.charAt(i) == letter) {
                counter++;
            }
        }
        System.out.printf("Символат \"%c\" се среща %d пъти",letter, counter);
    }
}
