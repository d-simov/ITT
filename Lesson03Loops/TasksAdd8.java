package Lesson03Loops;

import java.util.Scanner;

public class TasksAdd8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter coordinates for point A (X and Y):");

        double xa = sc.nextDouble();
        double ya = sc.nextDouble();

        if (xa == 0 && ya == 0) {
            System.out.println("\"A\" is in the centre of the coordinate system");
        }
        else if (xa == 0) {
            System.out.println("\"A\" is on the Y axis");
        }
        else if (ya == 0) {
            System.out.println("\"A\" is on the X axis");
        }
        else if (xa > 0 && ya > 0) {
            System.out.println("\"A\" is in Quadrant I");
        }
        else if (xa > 0 && ya < 0) {
            System.out.println("\"A\" is in Quadrant II");
        }
        else if (xa < 0 && ya < 0) {
            System.out.println("\"A\" is in Quadrant III");
        }
        else {
            System.out.println("\"A\" is in Quadrant IV");
        }
    }
}
