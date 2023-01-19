package Lesson07PracticeOnArrays;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("In the next several steps we will guide you through the process of creating an array for our practise.");
        int size;
        do {
            System.out.println("1. Please, enter a positive number for length of the array:");
            size = sc.nextInt();
        } while (size <= 0);

        int[] initialArray = new int[size];
        int countZero = 0;
        for (int i = 0; i < initialArray.length; i++) {
            do {
                System.out.println((i + 2) + ". Please, enter \"0\" or \"1\" for element No " + (i+1) + " of the array.");
                initialArray[i] = sc.nextInt();
                if (initialArray[i] == 0) {
                    countZero++;
                }
            } while (initialArray[i] < 0 || initialArray[i] > 1);
        }
        System.out.print((initialArray.length + 2) + ". Your initial array is:\n[");
        for (int i = 0; i < initialArray.length; i++) {
            if (i == initialArray.length - 1) {
                System.out.print(initialArray[i]);
            }
            else {
                System.out.print(initialArray[i] + ", ");
            }
        }
        System.out.println("]");

        int[] sortedArray = new int[initialArray.length];

        for (int i = 0; i < countZero - 1; i++) {
            sortedArray[i] = 0;
        }
        for (int i = countZero; i < sortedArray.length; i++) {
            sortedArray[i] = 1;
        }
        System.out.print((initialArray.length + 3) + ". Your sorted array is:\n[");
        for (int i = 0; i < sortedArray.length; i++) {
            if (i == sortedArray.length - 1) {
                System.out.print(sortedArray[i]);
            }
            else {
                System.out.print(sortedArray[i] + ", ");
            }
        }
        System.out.println("]");
    }
}
