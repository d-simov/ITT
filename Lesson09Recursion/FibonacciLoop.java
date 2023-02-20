package Lesson09Recursion;

import java.util.Scanner;

public class FibonacciLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int fibNum;
        do {
            System.out.println("Please, enter a positive number for the ending number of the Fibonacci sequence: ");
            fibNum = sc.nextInt();
        } while (fibNum <= 2);

        int beforePrevNum = 0;
        int prevNum = 1;
        int nextFib = 0;

        System.out.print("The Fibonacci sequence is [" + beforePrevNum + ", " + prevNum + ", ");
        for (int i = 3; i <= fibNum; i++) {
            nextFib = beforePrevNum + prevNum;
            if (i < fibNum) {
                System.out.print(nextFib + ", ");
            }
            else {
                System.out.print(nextFib);
            }
            beforePrevNum = prevNum;
            prevNum = nextFib;
        }
        System.out.println("] and its final number is " + nextFib + ".");
    }
}
