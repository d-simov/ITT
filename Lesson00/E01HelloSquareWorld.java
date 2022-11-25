package Lesson00;

import java.util.Scanner;

public class E01HelloSquareWorld {
    public static void main(String[] args) {


        System.out.println();
        System.out.println("I will eat this Java language with all the textile!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the side of the square:");
        int side = Integer.parseInt(scanner.nextLine());

        int squareArea = side * side;

        System.out.println("The area of the square is " + squareArea + ".");



    }
}
