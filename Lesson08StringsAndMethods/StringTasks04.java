package Lesson08StringsAndMethods;

import java.util.Scanner;

public class StringTasks04 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter a word or a sentence: ");
        String textSample = sc.nextLine().toLowerCase();

        char[] englishLetters = new char[26];
        for(int i = 0; i < englishLetters.length; i++) {
            englishLetters[i] = (char)(97 + i);
            System.out.println(englishLetters[i]);
        }

        int[] lettersCount = new int[englishLetters.length];

        for (int i = 0; i < englishLetters.length; i++) {
            int counter = 0;
            for (int j = 0; j < textSample.length(); j++) {
                if (englishLetters[i] == textSample.charAt(j)) {
                    counter++;
                }
            }
            lettersCount[i] = counter;
        }
        System.out.println("There are the following numbers of every english letter in your text \"" + textSample + "\": ");
        for (int i = 0; i < englishLetters.length; i++) {
            System.out.println(englishLetters[i] + " - " + lettersCount[i] + " times;");
        }
    }
}
