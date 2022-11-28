package Lesson00;

import java.util.Scanner;

public class BitwiseTask2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter an integer number between 0 and 50, incl.:");
        int number = Integer.parseInt(sc.nextLine());


        if (number < 0 || number > 50) {
            System.out.print("The number you entered is not valid");
            return;
        }
        int binaryRepresentation;
        int leftover;
        leftover = number % 2;
        binaryRepresentation = leftover;
        number /= 2;
        if (number > 0) {
            leftover = number % 2;
            binaryRepresentation = binaryRepresentation + leftover * 10;
            number /= 2;
            if (number > 0) {
                leftover = number % 2;
                binaryRepresentation = binaryRepresentation + leftover * 100;
                number /= 2;
                if (number > 0) {
                    leftover = number % 2;
                    binaryRepresentation = binaryRepresentation + leftover * 1000;
                    number /= 2;
                    if (number > 0) {
                        leftover = number % 2;
                        binaryRepresentation = binaryRepresentation + leftover * 10000;
                        number /= 2;
                        if (number > 0) {
                            leftover = number % 2;
                            binaryRepresentation = binaryRepresentation + leftover * 100000;
                        }
                    }
                }
            }
        }
        System.out.println("The binary representation of the number is " + binaryRepresentation);

    }

}
