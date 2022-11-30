package Lesson01;

import java.util.Scanner;

public class TaskBook8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a positive value for the first side of the triangle:");
        double side1 = Double.parseDouble(sc.nextLine());
        System.out.println("Please, enter a positive value for the second side of the triangle:");
        double side2 = Double.parseDouble(sc.nextLine());
        System.out.println("Please, enter a positive value for the first side of the triangle:");
        double side3 = Double.parseDouble(sc.nextLine());
        double area;
        double perimeter;
        System.out.println();

        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("One or more of the values are not positive numbers");
            System.out.println();
        }
		else if ((side1 + side2 <= side3) || (side2 + side3 <= side1) || (side1 + side3 <= side2)) {
            System.out.println("The entered numbers are not valid sizes of triangular sides.");
            System.out.println("The sum of each two sides should be greater number than the third side.");
            System.out.println();
        }
		else {
            area = Math.sqrt((side1 + side2 + side3)/2 * ((side1 + side2 + side3)/2 - side1) * ((side1 + side2 + side3)/2 - side2) * ((side1 + side2 + side3)/2 - side3));
            perimeter = side1 + side2 + side3;
            System.out.println("The area of the triangle is:");
            System.out.println(area);
            System.out.println("The area of the triangle is:");
            System.out.println(perimeter);
            System.out.println();
        }
        System.out.println("End of program.");
    }

}
