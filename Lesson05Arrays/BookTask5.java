package Lesson05Arrays;

import java.util.Scanner;

public class BookTask5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int length;
        do {
            System.out.println("Please, enter a positive number for length of the array: ");
            length = sc.nextInt();
        } while (length <= 0);

        int[] arrayOfIntegers = new int[length];
        for (int index = 0; index < arrayOfIntegers.length; index ++) {
            System.out.print("Please, enter a integer value for element No " + (index + 1) + " of the array: ");
            arrayOfIntegers[index] = sc.nextInt();
        }

        int arraySum = 0;
        for (int index = 0; index < arrayOfIntegers.length; index++) {
            arraySum += arrayOfIntegers[index];
        }

        double arrayAverage = arraySum * 1.0 / arrayOfIntegers.length;
        int closestToAverage = arrayOfIntegers[0];

        for (int index = 1; index < arrayOfIntegers.length; index++) {
            if (Math.abs(arrayOfIntegers[index] - arrayAverage) < Math.abs(closestToAverage - arrayAverage)) {
                closestToAverage = arrayOfIntegers[index];
            }
        }
        System.out.println();
        System.out.printf("Average value: %.2f\n", arrayAverage);
        System.out.println("Element, closest to the average value: " + closestToAverage);


    }

}
