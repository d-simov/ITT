package Lesson03Loops;

import java.util.Scanner;

public class TasksAdd1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Моля, въведете дължините на трите страни на триъгълник (в см):");
        int sideA = sc.nextInt();
        int sideB = sc.nextInt();
        int sideC = sc.nextInt();
        int perimeter;
        double area;

        perimeter = sideA + sideB + sideC;
        System.out.println("Периметърът на триъгълника е " + perimeter + " см.");

        area = (Math.sqrt((sideA + sideB + sideC) * (-sideA + sideB + sideC) * (sideA - sideB + sideC) * (sideA + sideB - sideC))/4.0);
        System.out.println("Площта на триъгълника е " + area  + " см.");

    }
}
