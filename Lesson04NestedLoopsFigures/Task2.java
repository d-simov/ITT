package Lesson04NestedLoopsFiguresFile;

import java.util.Scanner;

public class Task2 {


    public static void main(String[] args) {

        System.out.println("please enster a positive, integer number N for the height and the width of the figure:");
        Scanner sc = new Scanner(System.in);
        int figureSize = Integer.parseInt(sc.nextLine());

        for (int row = 0; row < figureSize; row++) {
            if (row % 2 != 0) {
                System.out.print(" ");
            }
            for (int symbol = 0; symbol < figureSize; symbol++) {
                System.out.print("# ");
            }
            System.out.println();
        }

    }
}
