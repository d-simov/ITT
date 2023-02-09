package Lesson08StringsAndMethods;

import java.util.Scanner;

public class Task02_Strings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word1;
        String word2;
        do {
            System.out.println("Please, enter 2 words with more than 6 symbols, divided by space: ");
            word1 = sc.next();
            word2 = sc.next();
        } while (word1.length() <= 6 || word2.length() <= 6);

        String tempSubString = word1.substring(0,5);
        word1 = word1.replace(word1.substring(0,5), word2.substring(0,5));
        word2 = word2.replace(word2.substring(0,5), tempSubString);

        if (word1.length() > word2.length()) {
            System.out.println(word1.length() + " " + word1);
        }
        else {
            System.out.println(word2.length() + " " + word2);
        }
    }
}
