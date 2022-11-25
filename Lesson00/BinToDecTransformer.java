package Lesson00;

import java.util.Scanner;

public class BinToDecTransformer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int binaryNumber = Integer.parseInt(sc.nextLine());
        int decimalNumber = 0;
        int binaryNumberCopy = binaryNumber;
        int powerOfTwo = 1;

        while (binaryNumber > 0) {
            int leftover = binaryNumber % 2;
            int decimalDigit = leftover * powerOfTwo;
            decimalNumber += decimalDigit;
            powerOfTwo *= 2;
            binaryNumber /= 10;
        }
        System.out.println("\nThe decimal representation of the binary number " + binaryNumberCopy + " is " + decimalNumber);
    }
}
