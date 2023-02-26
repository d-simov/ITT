package Lesson10PracticeOnStringsMethodsRecursion;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Task01HeadsAndTails {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String input;
        int counter = 0;
        while (true) {
            do {
                System.out.print("\nPlease, enter \"heads\" or \"tails\": ");
                input = sc.nextLine();
            } while (!input.equals("heads") && !input.equals("tails"));

            if (input.equals("heads")) {
                counter++;
            }
		else {
                counter = 0;
            }
            if (counter == 5) {
                break;
            }
        }
    }
}