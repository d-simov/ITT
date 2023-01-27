package Lesson08StringsAndMethods;

import java.util.Scanner;

public class BookTask04_Strings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter a string of chars: ");
        String symbols = sc.nextLine();

        if (checkIfPalindrome(symbols)) {
            System.out.print("Your char string IS a palindrome.");
        }
        else {
            System.out.print("Your char string is NOT a palindrome.");
        }
    }

    static boolean checkIfPalindrome(String a) {
        boolean isPal = true;
        for (int i = 0; i < a.length() / 2; i++) {
            if (a.charAt(i) != a.charAt(a.length() - 1 - i)) {
                isPal = false;
                break;
            }
        }
        return isPal;
    }
}
