package Lesson02PrimitiveTypesIfElseStatementNumeralSystems;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("What time is it? (enter hour as integer number):");
        int hour = sc.nextInt();
        if (hour < 0) {
            System.out.println("Какво е това отрицателно време? Ти не си от тая планета! Иди си вкъщи!");
            return;
        }
        System.out.println("Please, enter amount of money:");
        double amountOfMoney = sc.nextDouble();
        System.out.println("Are you healthy? (\"yes\" or \"no\"):");
        String healthyInput = sc.next();
        boolean isHealthy=false;

        if (healthyInput.equals("yes")) {
            isHealthy = true;
        } else if (healthyInput.equals("no")) {
            isHealthy = false;
        } else {
            System.out.println("Няма такова здравословно състояние.");
            return;
        }

        if (!isHealthy) {
            System.out.println("Няма да излизам!");
            if (amountOfMoney > 0) {
                System.out.println("Ще си купя лекарства.");
            }
            else {
                System.out.println("Ще стоя вкъщи и ще пия чай.");
            }
        }
        if (isHealthy) {
            if (amountOfMoney >= 10) {
                System.out.println("Ще отида на кино с приятели.");
            }
            else {
                System.out.println("Ще отида на кафе.");
            }
        }
    }
}
