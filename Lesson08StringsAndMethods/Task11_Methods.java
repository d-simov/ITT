package Lesson08StringsAndMethods;

import java.util.Scanner;

public class Task11_Methods {


    public static void main(String[] args) {

        int[] arrayOfNumbers = createArrayOfNumbers();
        fillArrayWithNumbers(arrayOfNumbers);
        printArray(arrayOfNumbers);

    }

    static int[] createArrayOfNumbers() {
        Scanner sc = new Scanner(System.in);
        int arrayLength;
        do {
            System.out.print("Please, enter a positive number for the Length of the array: ");
            arrayLength = sc.nextInt();
        } while (arrayLength <= 0);

        return  new int[arrayLength];
    }

    static void fillArrayWithNumbers(int[] array) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print ("\nPlease, enter a number for array element No " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
    }

    static void printArray(int[] array) {
        System.out.print("\nYour array looks like this: [");
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
