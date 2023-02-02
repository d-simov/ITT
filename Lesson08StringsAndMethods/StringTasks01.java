package Lesson08StringsAndMethods;

import java.util.Scanner;

public class StringTasks01 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a sentence:");
        String sentence = sc.nextLine();
        System.out.println("Please, enter one word:");
        String word = sc.nextLine();
        int wordPosition = findWordInSentence(sentence, word);

        if (wordPosition < 0) {
            System.out.println("The entered word is not present in the sentence.");
        }
        else {
            System.out.println("The word is found on position " + wordPosition + " in the sentence.");
        }

    }

    static int findWordInSentence(String string1, String string2) {
        return string1.indexOf(string2);
    }
}
