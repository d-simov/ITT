package Lesson00;

import java.util.Scanner;

public class BitwiseTask4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter 5 integer numbers. 4 of them should be equal 2 by 2.");
        System.out.println("This program will return the different one");

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        int number4 = sc.nextInt();
        int number5	= sc.nextInt();

        if (((number1 ^ number2) != 0) && ((number1 ^ number3) != 0) && ((number1 ^ number4) != 0) && ((number1 ^ number5) != 0)) {
            System.out.print("The non-duplicated number is " + number1);
        }
        else if (((number2 ^ number1) != 0) && ((number2 ^ number3) != 0) && ((number2 ^ number4) != 0) && ((number2 ^ number5) != 0)) {
            System.out.print("The non-duplicated number is " + number2);
        }
        else if (((number3 ^ number1) != 0) && ((number2 ^ number3) != 0) && ((number3 ^ number4) != 0) && ((number3 ^ number5) != 0)) {
            System.out.print("The non-duplicated number is " + number3);
        }
        else if (((number4 ^ number1) != 0) && ((number4 ^ number3) != 0) && ((number2 ^ number4) != 0) && ((number4 ^ number5) != 0)) {
            System.out.print("The non-duplicated number is " + number4);
        }
        else if (((number5 ^ number1) != 0) && ((number5 ^ number3) != 0) && ((number2 ^ number4) != 0) && ((number2 ^ number5) != 0)) {
            System.out.print("The non-duplicated number is " + number5);
        }
        else {
            System.out.println("There is no unique number in the sequence.");

        }

    }
}
