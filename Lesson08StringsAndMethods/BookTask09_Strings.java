package Lesson08StringsAndMethods;

import java.util.Scanner;

public class BookTask09_Strings {

    public static void main(String[] args) {


        char[] alphabet = new char[(int)(('z' - 'a') + 1)];
        for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = (char)(97 + i);
        }

        Scanner sc = new Scanner(System.in);
        String text;
        StringBuilder tempText = new StringBuilder();
        do {
            System.out.print("Please, enter some text (only small english letters will be taken under consideration): ");
            text = sc.nextLine().strip().toLowerCase();
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) >= 97 && text.charAt(i) <= 122) {
                    tempText.append(text.charAt(i));
                }
            }
            text = tempText.toString();
        } while (text.length() < 1);

        System.out.println("The english letters in your text are: \"" + text + "\"");

        int mostRepetitions = 0;
        char mostRepeatedLetter = '~';
        for (int i = 0; i < alphabet.length; i++) {
            int counter = 0;
            for (int j = 0; j < text.length(); j++) {
                if (alphabet[i] == text.charAt(j)) {
                    counter++;
                }
            }
            System.out.println(alphabet[i] + " - " + counter);
            if (mostRepetitions < counter) {
                mostRepetitions = counter;
                mostRepeatedLetter = alphabet[i];
            }
        }
        System.out.println("Most repeated letter is \"" + mostRepeatedLetter + "\" with " + mostRepetitions + " repetitions");



    }
}
