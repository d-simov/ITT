package Lesson08StringsAndMethods;

import java.util.Scanner;

public class BookTask10_Strings_Methods {

    public static void main(String[] args) {

        String[] sentenceByWords = insertAndSplitSentence();
        int maxCharsInWord = findMaxWordSymbols(sentenceByWords);

        for (int i = 0; i < sentenceByWords.length + 2; i++) {
            if (i == 0 || i == sentenceByWords.length + 1) {
                printRowOfStars(maxCharsInWord);
            }
            else {
                printStar();
                printWord(sentenceByWords, (i-1));
                printSpace(maxCharsInWord, sentenceByWords, i-1);
                printStar();
                System.out.println();
            }
        }
    }

    static String[] insertAndSplitSentence(){
        System.out.println("Please, enter a sentence: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine().split(" ");
    }

    private static int findMaxWordSymbols(String[] sentenceByWords) {
        int maxChars = 0;
        for (int wordIndex = 0; wordIndex < sentenceByWords.length; wordIndex++) {
            if (maxChars < sentenceByWords[wordIndex].length()) {
                maxChars = sentenceByWords[wordIndex].length();
            }
        }
        return maxChars;
    }

    static void printRowOfStars(int n){
        for (int i = 0; i < n + 2; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    static void printStar() {
        System.out.print("*");
    }

    static void printWord(String[] wordArray, int index){
        System.out.print(wordArray[index]);
    }

    static void printSpace(int n, String[] wordArray, int index){
        for (int i = 0; i < n - wordArray[index].length(); i++) {
            System.out.print(" ");
        }
    }
}
