package Lesson03NumberPatterns;

import java.util.Scanner;

public class Pattern18 {

    public static void main(String[] args) {

        System.out.println("Please, enter the maximum printing number (5 in the example):");
        Scanner sc = new Scanner(System.in);
        int maxPrintingNumber = sc.nextInt();
        int squareSideLength = 2 * maxPrintingNumber - 1;

        for (int i = 0; i < squareSideLength; i++) {
            int printingNumber = maxPrintingNumber;
            for (int j = 0; j < squareSideLength; j++) {
                if (printingNumber < (squareSideLength/2 + 1 - i)){
                    System.out.print((maxPrintingNumber - i) + "  ");
                }
                else {
                    System.out.print(printingNumber + "  ");
                }
                printingNumber--;
            }
            System.out.println();
        }
    }
}
