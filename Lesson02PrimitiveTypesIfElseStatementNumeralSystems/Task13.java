package Lesson02PrimitiveTypesIfElseStatementNumeralSystems;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int currentTemperature = sc.nextInt();

        if (currentTemperature > 100 || currentTemperature < -100) {
            System.out.println("Епа, нема такава температура!!!");
        }
        else if (currentTemperature < -20) {
            System.out.println("ледено студено");
        }
        else if (currentTemperature < 0) {
            System.out.println("студено");
        }
        else if (currentTemperature < 15) {
            System.out.println("хладно");
        }
        else if (currentTemperature <= 25) {
            System.out.println("топло");
        }
        else {
            System.out.println("горещо");
        }
    }
}
