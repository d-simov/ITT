package Lesson04NestedLoopsFiguresFile;

import java.util.Scanner;

public class ClassTask02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int squareSide;
        do {
            System.out.println("Please, enter a positive, even number, greater than \"2\" for the side of the square: ");
            squareSide = Integer.parseInt(sc.nextLine());
        } while (squareSide <= 2 || (squareSide % 2 == 0));

        String[][] square = new String[squareSide][squareSide];
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                if (i == 0 || j == 0 || i == square.length - 1 || j == square[i].length - 1 || i == j || i + j == square.length - 1){
                    square[i][j] = "#";
                }
                else {
                    square[i][j] = " ";
                }
            }
        }

        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                System.out.print(square[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
