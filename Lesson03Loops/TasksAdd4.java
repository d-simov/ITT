package Lesson03Loops;

import java.util.Scanner;

public class TasksAdd4 {

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
        else if ((month == 2) && ((year % 100 == 0) || (year % 4 != 0)) && (day > 28)) {
            System.out.println("Invalid date");
            return;
        }
        else if ((month == 2) && (day > 29)) {
            System.out.println("Invalid date");
            return;
        }
        int daysToDate = 0;
        int daysInMonth = 0;

        for (int currentMonth = month-1; currentMonth > 0; currentMonth--) {
            switch (currentMonth) {
                case 1, 3, 5, 7, 8, 10, 12 -> daysInMonth = 31;
                case 4, 6, 9, 11 -> daysInMonth = 30;
                case 2 -> {
                    if (year % 400 == 0) {
                        daysInMonth = 29;
                    }
                    else if (year % 100 == 0) {
                        daysInMonth = 28;
                    }
                    else if (year % 4 == 0) {
                        daysInMonth = 29;
                    }
                    else {
                        daysInMonth = 28;
                    }
                }

            }
            daysToDate += daysInMonth;
        }
        System.out.println("There are " + (daysToDate + day) + " days from the beginning of the year to your date.");

        }
    }

