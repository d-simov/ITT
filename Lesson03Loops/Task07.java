package Lesson03Loops;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Моля, въведете брой числа, които да изпишем (N):");
        int n = sc.nextInt();

        for (int i = 3; i <= n*3 ; i+=3) {
            System.out.print(i + ", ");
        }

    }
}
