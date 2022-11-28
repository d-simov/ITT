package Lesson00;

import java.util.Scanner;

public class BitwiseTask5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number1;
        int number2;
        int number3;

        do {
            System.out.println("Please, enter three positive, integer numbers (or zero)");
            number1 = sc.nextInt();
            number2 = sc.nextInt();
            number3 = sc.nextInt();
        } while (number1 < 0 || number2 < 0 || number3 < 0);

        int result;
        result = (1 << number1);
        result = (result | 1 << number2);
        result = (result | 1 << number3);

        System.out.println("The decimal number with bits \"1\" on positions " + number1 + ", " + number2 + ", " + number3 + " is: \"" + result + "\".");
    }
}


