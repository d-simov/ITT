package Lesson01;

import java.util.Scanner;

public class imitateNextChar {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Please, enter your name:");

        String name = sc.nextLine();
        char secondChar = name.charAt(1);

        System.out.println("The second character of your name is \"" + secondChar + "\".");
    }
}
