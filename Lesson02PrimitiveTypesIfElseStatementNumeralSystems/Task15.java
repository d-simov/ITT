package Lesson02PrimitiveTypesIfElseStatementNumeralSystems;

import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Моля, въведете час от денонощието:");
        int hour = sc.nextInt();

        if (hour < 0 || hour > 24) {
            System.out.println("Не съществува такъв час в дененощието");
            return;
        }
        if (hour >= 18 || hour <= 4) {
            System.out.println("Добър вечер!");
        }
        if (hour >= 4 && hour <= 9) {
            System.out.println("Добро утро!");
        }
        if (hour >= 9 && hour <= 18) {
            System.out.println("Добър ден!");
        }
        System.out.println();
        System.out.println("Краси, по условие граничните часове (4, 9, 18) влизат и в двата интервала, затова така съм изградил и решението.\nПоздрави!\nДидо");
    }
}
