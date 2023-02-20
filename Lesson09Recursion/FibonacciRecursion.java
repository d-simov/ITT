package Lesson09Recursion;

import java.util.Scanner;

public class FibonacciRecursion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int finalNum;
        do {
            System.out.println("Please, enter a positive number, greater than 2 for end of the Fibonacci sequence: ");
            finalNum = sc.nextInt();
        } while (finalNum <= 2);

        System.out.println("The final number of the Fibonacci sequence is: " + findFib(finalNum));
    }

    static int findFib(int last){
        if (last == 2) {
            return 1;
        }
        if (last == 1){
            return 0;
        }
        return findFib(last - 1) + findFib(last - 2);
    }
}
