package Lesson04NestedLoopsFiguresFile;

public class Task3 {


    public static void main(String[] args) {

        System.out.print("* |");
        for (int digit = 1; digit <= 9; digit++) {
            System.out.print("  " + digit);
        }
        System.out.println();
        System.out.println("------------------------------");

        for(int row = 1; row <= 9; row++) {
            System.out.print(row + " |");
            for (int number = 1; number <= 9; number++) {
                if ((number * row) < 10) {
                    System.out.print("  " + number * row);
                }
                else {
                    System.out.print(" " + number * row);
                }
            }
            System.out.println();
        }


    }

}
