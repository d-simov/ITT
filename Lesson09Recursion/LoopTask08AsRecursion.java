package Lesson09Recursion;

import java.util.Scanner;

public class LoopTask08AsRecursion {


    public static void main(String[] args) {

/*  По зададено число,  да се изведе на екрана таблица по
следния начин:

    1       2       3       4
    0       11      222     3333
            33      444     5555
                    666     7777
                            9999
 */
        Scanner sc = new Scanner(System.in);
        int initialNumber;
        do {
            System.out.print("Please, enter a positive number as an initial number: ");
            initialNumber = Integer.parseInt(sc.nextLine());
        } while (initialNumber <= 0);

        printRows(initialNumber - 1, initialNumber, 0);


    }

    private static void printRows(int startingNumber, int times, int counter) {
        if(counter == times){
            return;
        }
        printNumbers(startingNumber, times, 0);
        startingNumber+=2;
        printRows(startingNumber, times, ++counter);
    }

    private static void printNumbers(int startingNumber, int times, int counter) {
        if (counter == times) {
            System.out.println();
            return;
        }
        System.out.print(startingNumber);
        counter++;
        printNumbers(startingNumber, times, counter);
    }
}
