package Lesson08StringsAndMethods;

import java.util.Scanner;

public class BookTask10_Strings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter a sentence: ");
        String sentence = sc.nextLine();
        String[] sentenceByWords = sentence.split(" ");

        int maxWordLength = 0;
        for (int wordIndex = 0; wordIndex < sentenceByWords.length; wordIndex++) {
            int wordLength = 0;
            for (int letterIndex = 0; letterIndex < sentenceByWords[wordIndex].length(); letterIndex++) {
                wordLength++;
            }
            maxWordLength = (Math.max(wordLength, maxWordLength));
        }
        for (int wordIndex = 0; wordIndex < sentenceByWords.length + 2; wordIndex++) {
            if (wordIndex == 0 || wordIndex == sentenceByWords.length + 1) {
                for (int i = 0; i < maxWordLength + 2; i++) {
                    System.out.print("*");
                }
            }
            else {
                System.out.print ("*");
                System.out.print (sentenceByWords[wordIndex-1]);
                for (int i = 0; i < maxWordLength - sentenceByWords[wordIndex-1].length(); i++) {
                    System.out.print (" ");
                }
                System.out.print ("*");
            }
            System.out.println();
        }
    }
}
