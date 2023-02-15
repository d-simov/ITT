package Lesson08StringsAndMethods;

import java.util.Scanner;

public class Task12_Methods {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arrayLength;
        do {
            System.out.print("Please, enter a positive number for the Length of the array: ");
            arrayLength = sc.nextInt();
        } while (arrayLength <= 0);

        int[] numbersFromOneToN = createArrayToN(arrayLength);
        printArray(numbersFromOneToN);
    }

    static int[] createArrayToN(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    static void printArray(int[] array) {
        System.out.print("Your array looks like this: [");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i] + "]");
            }
            else {
                System.out.print(array[i] + ", ");
            }
        }
    }
}
