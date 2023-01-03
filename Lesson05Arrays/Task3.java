package Lesson05Arrays;

import java.util.Scanner;

public class Task3 {


    public static void main(String[] args) {

        System.out.println("Please, enter an integer number:");
        Scanner sc = new Scanner(System.in);

        int firstNumber = Integer.parseInt(sc.nextLine());
        int[] numbersArray = new int[10];

        numbersArray [0] = firstNumber;
        numbersArray [1] = firstNumber;

        for (int i = 2; i< numbersArray.length; i++) {
            numbersArray[i] = numbersArray[i-2] + numbersArray[i-1];
        }
        Task7.printArray(numbersArray);


    }

}
