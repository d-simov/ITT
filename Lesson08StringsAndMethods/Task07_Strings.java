package Lesson08StringsAndMethods;

import java.util.Scanner;

public class Task07_Strings {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String[] sentenceByWords = sc.nextLine().split(" ");

        int wordCount = sentenceByWords.length;
        int maxWordLength = 0;
        for (int i = 0; i < sentenceByWords.length; i++) {
            if (maxWordLength < sentenceByWords[i].length()) {
                maxWordLength = sentenceByWords[i].length();
            }
        }
        System.out.printf("%d words, the longest one is with %d symbols", wordCount, maxWordLength);
    }

}
