package Lesson02PrimitiveTypesIfElseStatementNumeralSystems;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalLitres = sc.nextInt();
        int times = totalLitres / 5;
        int leftOver = totalLitres % 5;
        int timesPer3 = 0;
        int timesPer2 = 0;

        if (leftOver % 3 == 0) {
            timesPer2 = times;
            timesPer3 = times + (leftOver / 3);
        } else if (leftOver % 2 == 0) {
            timesPer3 = times;
            timesPer2 = times + (leftOver / 2);
        }

        if (timesPer2 * 2 + timesPer3 * 3 == totalLitres) {
            System.out.println(times + " пъти по 2 литра,");
            System.out.println(times + " пъти по 3 литра");
            if (timesPer3 != times) {
                System.out.println("допълнително " + (timesPer3 - times) + " кофи по 3 литра");
                return;
            } else if (timesPer2 != times) {
                System.out.println("допълнително " + (timesPer2 - times) + " кофи по 2 литра");
                return;
            }
            else {
                System.out.println("Без нужда от допълнителни кофи");
                return;
            }

        }
        else {
            times--;
            leftOver +=5;
        }

        if (leftOver % 3 == 0) {
            timesPer2 = times;
            timesPer3 = times + (leftOver / 3);
        } else if (leftOver % 2 == 0) {
            timesPer3 = times;
            timesPer2 = times + (leftOver / 2);
        }

        if (timesPer2 * 2 + timesPer3 * 3 == totalLitres) {
            System.out.println(times + " пъти по 2 литра,");
            System.out.println(times + " пъти по 3 литра");
            if (timesPer3 != times) {
                System.out.println("допълнително " + (timesPer3 - times) + " кофи по 3 литра");
            } else if (timesPer2 != times) {
                System.out.println("допълнително " + (timesPer2 - times) + " кофи по 2 литра");
            } else {
                System.out.println("Без нужда от допълнителни кофи");
            }
        }
    }
}
