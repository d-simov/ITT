package Lesson08StringsAndMethods;

import java.util.Scanner;

public class StringTasks03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a new word or sentence");

        String string1 = sc.nextLine().trim();
        boolean isPalindrome = true;
        for (int i = 0; i < string1.length(); i++) {
            if (string1.charAt(i) != string1.charAt(string1.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Your string is a palindrome");
        }
        else {
            System.out.println("Your string is NOT a palindrome");
        }
    }
}
