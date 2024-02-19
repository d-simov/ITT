package Lesson09Recursion;

import java.util.Scanner;

public class LoopTask10AsRecursion {


    public static void main(String[] args) {
//         Въведете число от клавиатурата и определете дали е
//просто. Просто число е това което се дели САМО на 1 и на себе си.

        Scanner sc = new Scanner(System.in);
        int numberEntered;
        do {
            System.out.print("Please enter a number to check if it is simple one: ");
            numberEntered = Integer.parseInt(sc.nextLine());

        } while (numberEntered > -2 && numberEntered < 2);
        boolean isSimple;

        if (numberEntered > 0) {
            isSimple = findIfSimple(2, numberEntered - 1, numberEntered);
        }
        else {
            isSimple= findIfSimple(numberEntered + 1, -2, numberEntered);
        }
        if (isSimple) {
            System.out.println("The entered number is simple");
        } else {
            System.out.println("The number is NOT simple");
        }

    }

    private static boolean findIfSimple(int startingNumber, int endingNumber, int magicNumber) {
        if (startingNumber == endingNumber) {
            return true;
        }
        else {
            if(magicNumber % startingNumber == 0) {
                return false;
            }
            return findIfSimple(++startingNumber, endingNumber, magicNumber);
        }
    }
}
