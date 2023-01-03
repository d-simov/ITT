package Lesson05Arrays;

import java.util.Scanner;

public class Task2 {


    public static void main(String[] args) {

        System.out.println("Please, enter a sequence of numbers, divided by SPACE:");
        Scanner sc = new Scanner(System.in);

        String[] arrayAsString = sc.nextLine().split(" ");
        int[] firstNumberArray = new int[arrayAsString.length];
        int[] secondNumberArray = new int[firstNumberArray.length];

        for (int i = 0; i < arrayAsString.length; i++) {
            firstNumberArray[i] = Integer.parseInt(arrayAsString[i]);
        }
        for (int i = 0; i < secondNumberArray.length/2; i++) {
            secondNumberArray[i] = firstNumberArray[i];
        }
        for (int i = secondNumberArray.length/2; i < secondNumberArray.length; i++) {
            secondNumberArray[i] = firstNumberArray [firstNumberArray.length - 1  - i];
        }
        System.out.println();
        System.out.print("[");
        for (int i = 0; i < secondNumberArray.length; i++) {
            if (i == (secondNumberArray.length - 1)) {
                System.out.print(secondNumberArray[i]);
            }
            else {
                System.out.print(secondNumberArray[i] + ", ");
            }
        }
        System.out.println("]");

    }

}
