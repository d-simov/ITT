package Lesson03Loops;

import java.util.Scanner;

public class Task24 {

    public static void main(String[] args) {

        System.out.println("Моля, въведете естествено число от интервала [10 .. 30000]:");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        String numberAsString = "";

        while (number > 0){
            int currentDigit = number % 10;
            String currentDigitAsString = currentDigit + "";
            numberAsString += currentDigitAsString;
            number /= 10;
        }
        boolean isPalindrome = true;
        for (int i = 0; i < (numberAsString.length() - 1) / 2; i++) {
            if (numberAsString.charAt(i) != numberAsString.charAt(numberAsString.length()-1-i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Числото е палиндром.");
        }
        else {
            System.out.println("Числото не е палиндром");
        }
    }
}
