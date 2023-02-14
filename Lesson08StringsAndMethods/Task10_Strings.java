package Lesson08StringsAndMethods;

import java.util.Scanner;

public class Task10_Strings {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String initialText = sc.nextLine();
        StringBuilder finalText = new StringBuilder();

        for (int i = 0; i < initialText.length(); i++) {
            finalText.append((char) (initialText.charAt(i) + 5));
        }
        System.out.println(initialText);
        System.out.println(finalText);


    }
}
