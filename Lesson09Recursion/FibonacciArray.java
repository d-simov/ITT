package Lesson09Recursion;

import java.util.Scanner;

public class FibonacciArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int finalNum;
        do {
            System.out.println("Please, enter a positive number, greater than 2 for end of the Fibonacci sequence: ");
            finalNum = sc.nextInt();
        } while (finalNum <= 2);

        int[] fibArray = new int[finalNum];
        fibArray[0] = 0;
        fibArray[1] = 1;
        for (int i = 2; i < finalNum; i++) {
            fibArray[i] = fibArray[i-1] + fibArray[i-2];
        }
        System.out.print("The Fibonacci sequence is [");
        for (int i = 0; i < fibArray.length; i++) {
            if (i != fibArray.length - 1) {
                System.out.print(fibArray[i] + ", ");
            }
            else {
                System.out.println(fibArray[i] + "] and its final number is " + fibArray[i] + ".");
            }
        }

    }

}
