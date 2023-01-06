package Lesson05Arrays;

import java.util.Scanner;

public class Task7 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int lengthOfArrays;
        do {
            System.out.println("Please, enter a positive, integer number for the length of Array1:");
            lengthOfArrays = Integer.parseInt(sc.nextLine());
        } while (lengthOfArrays <= 0);

        int[] array1 = new int[lengthOfArrays];

        for (int i = 0; i < array1.length; i++) {
            System.out.println("Please, enter value for variable No " + (i + 1));
            array1[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.print("Thank you. Your array is \n[");
        printArray(array1);

        int[] array2 = new int[array1.length];
        for(int i = 0; i < array2.length; i++) {
            if (i == 0 || i == array2.length - 1) {
                array2[i] = array1[i];
            }
            else {
                array2[i] = array1[i - 1] + array1[i + 1];
            }
        }

        System.out.print("Your new array is \n[");
        printArray(array2);
        System.out.println();
        System.out.println("You are the best!");

    }

    static void printArray(int[] array1) {

        for (int i = 0; i < array1.length; i++) {
            if (i == array1.length - 1) {
                System.out.print(array1[i]);
            } else {
                System.out.print(array1[i] + ", ");
            }
        }
        System.out.println("]");
    }
}
