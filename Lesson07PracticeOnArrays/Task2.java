package Lesson07PracticeOnArrays;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int lengthOfArray;
        do {
            System.out.println("Please, enter a positive number, greater than 1 for length of the array: ");
            lengthOfArray = scanner.nextInt();
        } while (lengthOfArray <= 1);

        int[] array = new int[lengthOfArray];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please, enter value for element No " + i + ": ");
            array[i] = scanner.nextInt();
        }

        boolean isRugged = true;
        if (array[1] > array[0]) {
            for (int i = 0; i < array.length; i++) {
                if (i == array.length - 1) {
                    if ((i % 2 != 0) && (array[i] <= array[i-1])) {
                        isRugged = false;
                        break;
                    }
                }
				else if ((i % 2 != 0) && ((array[i] <= array[i - 1]) || (array [i] <= array[i + 1]))) {
                    isRugged = false;
                    break;
                }
            }
        }
        else if (array[1] < array[0]){
            for (int i = 0; i < array.length; i++) {
                if (i == array.length - 1) {
                    if ((i % 2 != 0) && (array[i] >= array[i-1])) {
                        isRugged = false;
                        break;
                    }
                }
				else if ((i % 2 != 0) && ((array[i] >= array[i - 1]) || (array[i] >= array[i + 1]))) {
                    isRugged = false;
                    break;
                }
            }
        }
        else {
            isRugged = false;
        }
        if (isRugged) {
            System.out.println("The array is rugged.");
        }
        else {
            System.out.println("the array is NOT rugged!");
        }
    }

}
