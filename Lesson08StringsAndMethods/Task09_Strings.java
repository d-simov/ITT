package Lesson08StringsAndMethods;

import java.util.Scanner;

public class Task09_Strings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String initialText = sc.nextLine();

        boolean isNegative = false;
        int number = 0;
        int sum = 0;

        for (int i = 0; i < initialText.length(); i++) {
            boolean isNumber = (initialText.charAt(i) >= '0' && initialText.charAt(i) <= '9');
            if (initialText.charAt(i) == '-') {
                isNegative = true;
                if (number != 0) {
                    System.out.println(number);
                }
                sum += number;
                number = 0;
                continue;
            }
            if (i == initialText.length() - 1) {
                if (isNumber) {
                    number = number * 10 + ((int)(initialText.charAt(i)) - 48);
                }
                if (isNegative) {
                    number *= -1;
                }
                if (number != 0) {
                    System.out.println(number);
                }
                sum += number;
            }
            if (isNumber) {
                number = number * 10 + ((int)(initialText.charAt(i)) - 48);
            }
            else {
                if (isNegative) {
                    number *= -1;
                }
                if (number != 0) {
                    System.out.println(number);
                }
                sum += number;
                number = 0;
                isNegative = false;
            }
        }
        System.out.println("Сума: " + sum);


    }
}
