package Lesson04PracticeOnLoops;

import java.util.Scanner;

public class Task6_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberDec;
        do {
            System.out.println("Please, enter a positive, integer number:");
            numberDec = Integer.parseInt(sc.nextLine());
        } while (numberDec <= 0);

        int numberDecCopy = numberDec;
        long numberBin = 0;
        long counter = 1;
        int countOne = 0;

        while (numberDec > 0) {
            int leftover = numberDec % 2;
            if (leftover != 0) {
                countOne++;
            }
            numberBin = numberBin + (counter * leftover);
            counter *= 10;
            numberDec /= 2;
        }

        System.out.println("The binary representation of the decimal number \"" + numberDecCopy + "\" is \"" + numberBin + "\" and it contains " + countOne + " \"1\"-s in it.");
    }

}
