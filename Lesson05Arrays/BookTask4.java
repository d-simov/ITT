package Lesson05Arrays;

import java.util.Scanner;

public class BookTask4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arrayLength;
        do {
            System.out.print("Please, enter a positive number for length of the array: ");
            arrayLength = sc.nextInt();
        } while (arrayLength <= 0);

        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Please, enter a number for element " + (i + 1) + " of the array: ");
            array[i] = sc.nextInt();
        }
        int count = 1;
        String sequence = (array[0] + " ");
        int maxCount = 1;
        String maxSequence = "";

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i-1]) {
                count++;
                sequence = sequence + array[i] + " ";
            }
            else {
                if (count > maxCount) {
                    maxCount = count;
                    maxSequence = sequence;
                }
                sequence = (array[i] + " ");
                count = 1;
            }
        }
        if (count > maxCount) {
            maxCount = count;
            maxSequence = sequence;
        }
        System.out.println();
        if (maxCount == 1) {
            System.out.println("There is no sequence, longer than \"1\" in this array.");
        }
        else {

            System.out.println("The longest sequence of equal elements in the array is:\n" + maxSequence);
        }


    }

}
