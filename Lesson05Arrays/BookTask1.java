package Lesson05Arrays;

import java.util.Scanner;

public class BookTask1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arraySize;
        do {
            System.out.println("Please, enter a positive, even number for size of the array:");
            arraySize = sc.nextInt();
        } while (arraySize <= 0 || arraySize % 2 != 0);

        int[] array1 = new int[arraySize];
        for (int indexArray = 0; indexArray < arraySize; indexArray++) {
            System.out.println("Please, enter the value for component " + (indexArray + 1) + " of the array");
            array1[indexArray] = sc.nextInt();
        }

        int[] array2 = new int[array1.length];
        for (int indexArray = 0; indexArray < array2.length / 2; indexArray++) {
            array2[indexArray] = array1[indexArray];
        }
        int counter = 1;
        for (int indexArray = array2.length / 2; indexArray < array2.length; indexArray++) {
            array2[indexArray] = array1[array1.length - counter];
            counter++;
        }

        System.out.print("[");
        for (int indexArray = 0; indexArray < array2.length; indexArray++) {
            if (indexArray == array2.length - 1) {
                System.out.print(array2[indexArray]);
            }
            else {
                System.out.print(array2[indexArray] + ", ");
            }
        }
        System.out.println("]");
    }

}
