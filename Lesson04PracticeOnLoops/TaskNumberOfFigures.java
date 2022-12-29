package Lesson04PracticeOnLoops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TaskNumberOfFigures {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int figuresHeight;
        System.out.println();

        do {
            System.out.println("Please, enter a positive, odd number for the height of the figures of dots:");
            figuresHeight = Integer.parseInt(sc.nextLine());
        } while (figuresHeight <= 0 || figuresHeight % 2 == 0);

        for (int row = 0; row < figuresHeight; row++) {

            if (row == figuresHeight / 2) {
                for (int space = 0; space < figuresHeight / 2; space++) {
                    System.out.print("   ");
                }
                System.out.print("*  ");
                for (int space = 0; space < figuresHeight / 2; space++) {
                    System.out.print("   ");
                }
                System.out.print("    ");
                for (int star = 0; star < figuresHeight; star++) {
                    System.out.print("*  ");
                }
                System.out.print("    ");
                for (int space = 0; space < figuresHeight / 2; space++) {
                    System.out.print("   ");
                }
                System.out.print("*  ");
                for (int space = 0; space < figuresHeight / 2; space++) {
                    System.out.print("   ");
                }
                System.out.println();
            }
            else if (row < figuresHeight / 2) {
                for (int space = 0; space < row; space++) {
                    System.out.print("   ");
                }
                System.out.print("*  ");
                for (int space = figuresHeight - 2 - row * 2; space >0; space--) {
                    System.out.print("   ");
                }
                System.out.print("*  ");
                for (int space = 0; space < row; space++) {
                    System.out.print("   ");
                }
                System.out.print("    ");
                for (int spacePlus = 0; spacePlus < figuresHeight / 2; spacePlus++) {
                    System.out.print("   ");
                }
                System.out.print("*  ");
                for (int spacePlus = 0; spacePlus < figuresHeight / 2; spacePlus++) {
                    System.out.print("   ");
                }
                System.out.print("    ");
                for (int space = 0; space < row; space++) {
                    System.out.print("   ");
                }
                System.out.print("*  ");
                for (int space = figuresHeight - 2 - row * 2; space >0; space--) {
                    System.out.print("   ");
                }
                System.out.print("*  ");
                for (int space = 0; space < row; space++) {
                    System.out.print("   ");
                }
                System.out.println();
            }
            else  {
                for (int space = 0; space < figuresHeight - 1 - row; space++) {
                    System.out.print("   ");
                }
                System.out.print("*  ");
                for (int space = row * 2 - figuresHeight; space >0; space--) {
                    System.out.print("   ");
                }
                System.out.print("*  ");
                for (int space = 0; space < figuresHeight - 1 - row; space++) {
                    System.out.print("   ");
                }
                System.out.print("    ");
                for (int spacePlus = 0; spacePlus < figuresHeight / 2; spacePlus++) {
                    System.out.print("   ");
                }
                System.out.print("*  ");
                for (int spacePlus = 0; spacePlus < figuresHeight / 2; spacePlus++) {
                    System.out.print("   ");
                }
                System.out.print("    ");
                for (int space = 0; space < figuresHeight -1 - row; space++) {
                    System.out.print("   ");
                }
                System.out.print("*  ");
                for (int space = row * 2 - figuresHeight; space >0; space--) {
                    System.out.print("   ");
                }
                System.out.print("*  ");
                for (int space = 0; space < figuresHeight -1 - row; space++) {
                    System.out.print("   ");
                }
                System.out.println();
            }
        }



    }
}
