package Lesson09Recursion;

import java.util.Scanner;

public class LoopTask05 {

    public static void main(String[] args) {
//      Да се въведат от потребителя 2 числа. И да се
//      изведат на екрана всички числа от по-малкото до по-голямото.
//      Да се използва рекурсия.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int smallerNumber = scanner.nextInt();
        System.out.print("\nEnter the second number: ");
        int greaterNumber = scanner.nextInt();

        if (smallerNumber > greaterNumber) {
            int temp = greaterNumber;
            greaterNumber = smallerNumber;
            smallerNumber = temp;
        }
        printNumber(smallerNumber, greaterNumber);
    }
    static void printNumber(int startingNumber, int finalNumber) {
        System.out.println(startingNumber);
        if(startingNumber == finalNumber) {
            return;
        }
        printNumber(++startingNumber, finalNumber);
    }
}
