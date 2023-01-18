package Lesson07PracticeOnArrays;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        char[] arrayChar = {'о','1','f','@',']','`'};
        System.out.println("Please, enter 1 char to check for in the array:");
        System.out.println("(if you enter more symbols, only the first will be taken under consideration)");
        Scanner sc = new Scanner(System.in);
        char character = sc.nextLine().charAt(0);

        boolean isFound = false;
        for (int i = 0; i < arrayChar.length; i++) {
            if (character == arrayChar[i]) {
                isFound = true;
                System.out.println("Your character is found on position " + i + " of the array.");
                break;
            }
        }
        if (!isFound) {
            System.out.println("Your character is not present in the array.");
        }
    }

}
