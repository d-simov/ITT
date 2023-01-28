package Lesson08StringsAndMethods;

import java.util.Arrays;
import java.util.Scanner;

public class BookTask05_Strings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter one word (if entered more, only the first one will be taken under consideration)");
        String word = sc.next();

        char[] wordCharsEdited = new char[word.length()];

        for (int i = 0; i < wordCharsEdited.length; i++) {
            wordCharsEdited[i] = (char)(word.charAt(i) + 5);
            System.out.print(wordCharsEdited[i]);
        }
        System.out.println();
        String newWord = Arrays.toString(wordCharsEdited);
        System.out.println(newWord);

    }

}
