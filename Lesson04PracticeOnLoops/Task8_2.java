package Lesson04PracticeOnLoops;

import java.util.Scanner;

public class Task8_2 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int triangularHeight;

        do {
            System.out.println("Please, enter a positive, integer number, greater than \"1\" for the height of the triangular:");
            triangularHeight = Integer.parseInt(sc.nextLine());
        } while (triangularHeight <= 1);

        for (int row = 1; row <= triangularHeight; row++) {
            for (int star = 1; star <= row * 2 - 1; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
