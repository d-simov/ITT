package Lesson08StringsAndMethods;

import java.util.Scanner;

public class Task08_Strings {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String testString = sc.nextLine();
        boolean isPalindrome = true;
        for (int i = 0; i < testString.length(); i++) {
            if (testString.charAt(i) != testString.charAt(testString.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Yes.");
        }
        else {
            System.out.println("No.");
        }
    }
}
