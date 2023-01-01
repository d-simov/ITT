package Lesson05Arrays;

import java.util.Scanner;

public class BookTask2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arrayLength;
        do {
            System.out.println("Please, enter a positive number for the of the array:");
            arrayLength = sc.nextInt();
        } while (arrayLength <= 0);

        int[] array = new int [arrayLength];
        for (int index = 0; index < array.length; index++) {
            System.out.print("Please, enter a number for element" + (index + 1) + " of the array: ");
            array[index] = sc.nextInt();
        }
        boolean isMirror = true;
        for (int index = 0; index < array.length; index++) {
            if (array[index] != array[array.length - 1 - index]) {
                isMirror = false;
                break;
            }
        }
        System.out.println("Is the array mirrorlike?");
        if (isMirror) {
            System.out.println("YES!");
        }
        else {
            System.out.println("No.");
        }

    }

}
