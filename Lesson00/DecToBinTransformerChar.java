package Lesson00;

import java.util.Scanner;

public class DecToBinTransformerChar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String binaryNumber = "";
        int decimalNumber = sc.nextInt();
        int decimalNumberCopy = decimalNumber;


        while (decimalNumber > 0) {
            int leftover = decimalNumber % 2;
            binaryNumber = binaryNumber + (leftover);
            decimalNumber /= 2;
        }
        String binaryReversed = "";
        char charsFromBinaryString[] = binaryNumber.toCharArray();
        for (int i = binaryNumber.length() - 1; i >= 0 ; i--) {
            binaryReversed += charsFromBinaryString[i];
        }
        
        System.out.println("The binary representation of the decimal " + decimalNumberCopy + " is " + binaryReversed + ".");

    }
}
