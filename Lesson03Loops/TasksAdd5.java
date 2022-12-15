package Lesson03Loops;

import java.util.Scanner;

public class TasksAdd5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a preferred language (‘en’, ‘es’, ‘de’, ‘bg’ or ‘缩写’):");
        String language = sc.nextLine();

        switch (language) {
            case "en" -> System.out.println("Hello World!");
            case "es" -> System.out.println("Hola Mundo!");
            case "de" -> System.out.println("Hallo Welt!");
            case "bg" -> System.out.println("Здравей, Свят!");
            case "‘缩写" -> System.out.println("你好世界！");
            default -> System.out.println("You did not select among the enlisted languages");
        }
    }
}
