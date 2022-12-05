package Lesson02PrimitiveTypesIfElseStatementNumeralSystems;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Моля, въведете позициите на двете шахматни полета - четири цели числа от 1 до 8, разделени с интервал:");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        if (((x1 % 2 == 0 && y1 % 2 == 0) || (x1 % 2 !=0 && y1 % 2 !=0)) && ((x2 % 2 == 0 && y2 % 2 == 0) || (x2 % 2 !=0 && y2 % 2 !=0))) {
            System.out.println("Позициите са с еднакъв цвят");
        }
        else if (((x1 % 2 != 0 && y1 % 2 == 0) || (x1 % 2 ==0 && y1 % 2 !=0)) && ((x2 % 2 != 0 && y2 % 2 == 0) || (x2 % 2 ==0 && y2 % 2 !=0))) {
            System.out.println("Позициите са с еднакъв цвят");
        }
        else {
            System.out.println("Позициите са с различен цвят");
        }
    }
}
