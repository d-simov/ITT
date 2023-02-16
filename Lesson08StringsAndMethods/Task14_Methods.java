package Lesson08StringsAndMethods;

import java.util.Scanner;

public class Task14_Methods {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Please, enter a positive number for factorial calculation: ");
            n = Integer.parseInt(sc.nextLine());
        } while (n <= 0);

        System.out.println("The factorial of " + n + " is " + calculateFactorial(n) + ".");
    }

    static int calculateFactorial(int factorialMaxInt) {
        int factorial = 1;
        for (int i = 1; i <= factorialMaxInt; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
