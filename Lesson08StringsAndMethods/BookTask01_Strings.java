package Lesson08StringsAndMethods;

import java.util.Scanner;

public class BookTask01_Strings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text1;
        String text2;

        do {
            System.out.println("Please, enter several words - each starting with capital letter (up to 40 symbols altogether):");
            text1 = sc.nextLine();
            System.out.println("Please, enter several words again -each starting with capital letter (up to 40 symbols altogether):");
            text2 = sc.nextLine();
        } while (text1.length() > 40 || text2.length() > 40);

        System.out.println(text1.toUpperCase() + " " + text1.toLowerCase());
        System.out.println(text2.toUpperCase() + " " + text2.toLowerCase());
    }

}
