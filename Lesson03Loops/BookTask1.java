package Lesson03Loops;

import java.util.Scanner;

public class BookTask1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter two integer numbers:");

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int minNumber = number2;
        int maxNumber = number1;

        if (number1 < number2) {
            minNumber = number1;
            maxNumber = number2;
        }

        System.out.print("The numbers between " + minNumber + " and " + maxNumber + " are: ");
        for (int currentNumber = minNumber; currentNumber <= maxNumber; currentNumber++) {
            if (currentNumber < maxNumber) {
                System.out.print(currentNumber + ", ");
            }
            else {
                System.out.println(currentNumber + ".");
            }
        }



    }

}
