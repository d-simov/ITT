package Lesson05Arrays;

import java.util.Scanner;

public class BookTask6 {

    public static void main(String[] args) {

        int[] array = new int[7];

        System.out.println("Please, enter 7 numbers from the keyboard: ");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("The elements, we are looking for are: ");
        for (int i = 0; i < 7; i++) {
            if (array[i] > 5 && array[i] % 5 == 0) {
                System.out.print(array[i] + " ");
            }
        }

    }

}
