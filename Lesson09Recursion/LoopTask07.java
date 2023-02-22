package Lesson09Recursion;

import java.util.Scanner;

public class LoopTask07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter how many numbers, divisible by 3 do you want: ");
        int number = sc.nextInt();

        print(3, 1, number);

    }

    static void print(int startingNumber, int counter, int givenNumber) {
        if (counter < givenNumber) {
            System.out.print(startingNumber + ", ");
        }
        if (counter == givenNumber) {
            System.out.print(startingNumber);
            return;
        }
        print(startingNumber + 3, counter + 1, givenNumber);
    }
}
