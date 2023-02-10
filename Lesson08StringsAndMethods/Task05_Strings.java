package Lesson08StringsAndMethods;

import java.util.Scanner;

public class Task05_Strings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter two words, separated by space: ");
        String word1 = sc.next();
        String word2 = sc.next();

        int charPositionWord1 = -1;
        int charPositionWord2 = -1;
        boolean lettersMatch = false;
        for (int i = 0; i < word1.length(); i++) {
            for (int j = 0; j < word2.length(); j++) {
                if (word1.charAt(i) == word2.charAt(j)) {
                    lettersMatch = true;
                    charPositionWord1 = i;
                    charPositionWord2 = j;
                    break;
                }
            }
            if (lettersMatch) {
                break;
            }
        }
        if (lettersMatch){
            for (int i = 0; i < word1.length(); i++) {
                if (i == charPositionWord1) {
                    System.out.println(word2);
                }
                else {
                    for (int k = 0; k < charPositionWord2; k++) {
                        System.out.print(" ");
                    }
                    System.out.println(word1.charAt(i));
                }
            }
        }
        else {
            System.out.println("There are no matching letters in these two words.");
        }

    }

}
