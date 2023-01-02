package Lesson05Arrays;

import java.util.Scanner;

public class BookTask10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int initialNumber;
        do {
            System.out.print("Please, enter a positive, integer number: ");
            initialNumber = sc.nextInt();
        } while (initialNumber <= 0);

        int binaryLength = 0;
        int number = initialNumber;

        while (number != 0) {
            number /= 2;
            binaryLength++;
        }
        int[] binaryRepresentation = new int[binaryLength];

        for (int i = binaryRepresentation.length - 1; i >= 0; i--) {
            binaryRepresentation[i] = initialNumber % 2;
            initialNumber /= 2;
        }
        for (int i = 0; i < binaryRepresentation.length; i++) {
            System.out.print(binaryRepresentation[i] + " ");
        }
    }

}
