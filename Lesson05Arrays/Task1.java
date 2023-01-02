package Lesson05Arrays;

import java.util.Scanner;

public class Task1 {



    public static void main(String[] args) {

        System.out.println("Please, enter a any amount of numbers, separated by SPACE: ");
        Scanner sc = new Scanner(System.in);

        String[] numbersAsString = sc.nextLine().split(" ");
        int[] numbersDecimal = new int[numbersAsString.length];
        int LeastDevidible = Integer.MAX_VALUE;

        for (int i = 0; i < numbersAsString.length; i++) {
            numbersDecimal[i] = Integer.parseInt(numbersAsString[i]);
            if ((numbersDecimal[i] % 3 == 0) && (numbersDecimal[i] < LeastDevidible)) {
                LeastDevidible = numbersDecimal[i];
            }
        }
        System.out.print("The smallest of all numbers typed that is devisible by 3 is \"" + LeastDevidible + "\".");

    }
}
