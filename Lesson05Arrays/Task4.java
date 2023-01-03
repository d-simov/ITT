package Lesson05Arrays;

import java.util.Scanner;

public class Task4 {



    public static void main(String[] args) {

        System.out.println("Please, enter a sequence of numbers, divided by space:");
        Scanner sc = new Scanner(System.in);

        String[] arrayOfStrings = sc.nextLine().split(" ");
        int[] arrayofNumbers = new int[arrayOfStrings.length];

        for (int i = 0; i < arrayofNumbers.length; i++) {
            arrayofNumbers[i] = Integer.parseInt(arrayOfStrings[i]);
        }
        boolean isMirrorLike = true;
        for(int i = 0; i < arrayofNumbers.length / 2; i++) {
            if(arrayofNumbers[i] != arrayofNumbers[arrayofNumbers.length - 1 - i]) {
                isMirrorLike = false;
                break;
            }
        }
        if (isMirrorLike) {
            System.out.println("You have entered a mirror array.");
        }
        else {
            System.out.println("You have entered a non-mirror array.");
        }
    }

}
