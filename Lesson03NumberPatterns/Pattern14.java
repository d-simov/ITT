package Lesson03NumberPatterns;

import java.util.Scanner;

public class Pattern14 {

    public static void main(String[] args) {

        System.out.println("Please, enter the length of the side of the square (example is with 5):");
        Scanner sc = new Scanner(System.in);
        int squareSideLength = sc.nextInt();

        for (int i = 0; i < squareSideLength; i++) {
            int printingNumber = squareSideLength;
            for (int j = 0; j < squareSideLength; j++) {
                if (printingNumber < (squareSideLength - i)){
                    System.out.print((squareSideLength - i) + " ");
                }
                else {
                    System.out.print(printingNumber + " ");
                }
                printingNumber--;
            }
            System.out.println();
        }
    }
}
