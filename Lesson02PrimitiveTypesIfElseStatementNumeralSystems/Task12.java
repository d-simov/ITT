package Lesson02PrimitiveTypesIfElseStatementNumeralSystems;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a day for the date:");
        int day = sc.nextInt();
        System.out.println("Please, enter a month for the date:");
        int month = sc.nextInt();
        System.out.println("Please, enter a year for the date:");
        int year = sc.nextInt();

        if ((day < 0 || day > 31) || (month < 0 || month > 12)) {
            System.out.println("Invalid date");
            return;
        }
        else if (((month == 4) || (month == 6) || (month == 9) || (month == 11)) && (day > 30)) {
            System.out.println("Invalid date");
            return;
        }
        else if ((month == 2) && (year % 400 == 0) && (day > 29)) {
            System.out.println("Invalid date");
            return;
        }
        else if ((month == 2) && (((year % 100 == 0) && (year % 400 != 0)) || (year % 4 != 0)) && (day > 28)) {
            System.out.println("Invalid date");
            return;
        }
        else if ((month == 2) && (day > 29)) {
            System.out.println("Invalid date");
            return;
        }

        if (((month == 4) || (month == 6) || (month == 9) || (month == 11)) && (day == 30)) {
            day = 1;
            month++;
        }
        else if (((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10)) && (day == 31)) {
            day = 1;
            month++;
        }
        else if (month == 12 && day == 31) {
            day = 1;
            month = 1;
            year++;
        }
        else if ((month == 2) && (year % 400 == 0) && (day > 28)) {
            day = 1;
            month++;
        }
        else if ((month == 2) && (year % 100 == 0) && (day > 27)) {
            day = 1;
            month++;
        }
        else if ((month == 2) && (year % 4 == 0) && (day > 28)) {
            day = 1;
            month++;
        }
        else if ((month == 2) && (year % 4 != 0) && (day > 27)) {
            day = 1;
            month++;
        }
        else {
            day++;
        }

        System.out.println(day + ", " + month + ", " + year);
    }
}
