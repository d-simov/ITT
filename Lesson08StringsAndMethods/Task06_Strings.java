package Lesson08StringsAndMethods;

import java.util.Scanner;

public class Task06_Strings {

    public static void main(String[] args) {


        String[] sentenceByWords = convertWordsToArray();

        for (int wordIndex = 0; wordIndex < sentenceByWords.length; wordIndex++) {

            String firstLetter =  sentenceByWords[wordIndex].substring(0,1).toUpperCase();
            String nextLetters = sentenceByWords[wordIndex].substring(1).toLowerCase();
            sentenceByWords[wordIndex] = firstLetter + nextLetters;
            System.out.print(sentenceByWords[wordIndex]);
            if (wordIndex == sentenceByWords.length - 1) {
                System.out.println(".");
            }
            else {
                System.out.print(" ");
            }
        }
    }

    static String[] convertWordsToArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a sentence: ");
        String sentence = sc.nextLine();
        return sentence.split(" ");
    }



}
