package Lesson08StringsAndMethods;

import java.util.Scanner;

public class Task03_Strings {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Please, enter two words, separated by space: ");
            String word1 = sc.next();
            String word2 = sc.next();

            int wordLength;
            if (word1.length() == word2.length()) {
                System.out.print("The two strings a equally long.");
                wordLength = word1.length();
            }
            else {
                wordLength = Math.min(word1.length(), word2.length());
                System.out.println("The longer string is" + (word1.length() > word2.length() ? "1" : "2"));
            }
            System.out.println("Разлика по позиции: ");
            for (int index = 0; index < wordLength; index++) {
                if (word1.charAt(index) != word2.charAt(index)) {
                    System.out.println((index + 1) + " " + word1.charAt(index) + "-" + word2.charAt(index));
                }
            }
    }


}
