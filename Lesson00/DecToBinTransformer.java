package Lesson00;

import java.util.Scanner;

public class DecToBinTransformer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long binaryNumber = 0L;
        int decimalNumber = sc.nextInt();
        int decimalNumberCopy = decimalNumber;
        long counter = 1;

        while (decimalNumber > 0) {
            int leftover = decimalNumber % 2;
            binaryNumber = binaryNumber + (leftover * counter);
            counter *= 10;
            decimalNumber /= 2;
        }
        System.out.println("The binary representation of the decimal " + decimalNumberCopy + " is " + binaryNumber + ".");

    }
}
