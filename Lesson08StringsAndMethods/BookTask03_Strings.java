package Lesson08StringsAndMethods;

import java.util.Scanner;

public class BookTask03_Strings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter a sentence: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        int maxWordLength = 0;

        for (int i = 0; i < words.length; i++) {
            if (maxWordLength < words[i].length()) {
                maxWordLength = words[i].length();
            }
        }
        System.out.printf("%d думи, най-дългата е с %d символа.", words.length, maxWordLength);
    }
}
