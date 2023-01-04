package Lesson04PracticeOnLoops;

import java.util.Scanner;

public class HumanFiguresOnStairs {

    public static void main(String[] args) {

        System.out.println();
        int numberOfStairs;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Please, enter a positive, integer number for the number of stairs, lesser than \"15\":");
            numberOfStairs = Integer.parseInt(sc.nextLine());
        } while (numberOfStairs <= 0 || numberOfStairs >= 15);

        for (int stairStep = 0; stairStep <= numberOfStairs; stairStep++) {
            if (stairStep < numberOfStairs) {
                for (int rowsInStep = 1; rowsInStep <= 3; rowsInStep++) {
                    if (rowsInStep == 1) {
                        for (int spaceBars = 0; spaceBars < numberOfStairs - stairStep - 1; spaceBars++) {
                            System.out.print("     ");
                        }
                        System.out.print("  o  ******");
                        for (int spaceBars = 0; spaceBars < stairStep; spaceBars++) {
                            System.out.print("     ");
                        }
                        System.out.println("*");
                    }
                    if (rowsInStep == 2) {
                        for (int spaceBars = 0; spaceBars < numberOfStairs - stairStep - 1; spaceBars++) {
                            System.out.print("     ");
                        }
                        System.out.print(" /|\\ *     ");
                        for (int spaceBars = 0; spaceBars < stairStep; spaceBars++) {
                            System.out.print("     ");
                        }
                        System.out.println("*");
                    }
                    if (rowsInStep == 3) {
                        for (int spaceBars = 0; spaceBars < numberOfStairs - stairStep - 1; spaceBars++) {
                            System.out.print("     ");
                        }
                        System.out.print(" / \\ *     ");
                        for (int spaceBars = 0; spaceBars < stairStep; spaceBars++) {
                            System.out.print("     ");
                        }
                        System.out.println("*");
                    }
                }
            }
            if (stairStep == numberOfStairs) {
                System.out.print("************");
                for (int i = 0; i < numberOfStairs-1; i++) {
                    System.out.print("*****");
                }
            }
        }
    }
}
