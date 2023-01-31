package Lesson08StringsAndMethods;

import java.util.Scanner;

public class BookTask08_Strings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String string1;
        boolean areDifferent;

        do {
            System.out.print("Please, enter a string, all characters must be different: ");
            string1 = sc.nextLine();
            areDifferent = true;
            for (int i = 0; i < string1.length(); i++) {
                for (int j = 0; j < string1.length(); j++) {
                    if (i != j) {
                        if (string1.charAt(i) == string1.charAt(j)) {
                            areDifferent = false;
                        }
                    }
                }
            }
        } while (!areDifferent);

                System.out.print("Please, enter a second (random) string: ");
                String string2 = sc.nextLine();
                boolean areCharactersSame = true;
                StringBuilder difChars = new StringBuilder();

                for (int i = 0; i < string1.length(); i++) {
                    boolean letterEquals = false;
                    for (int j = 0; j < string2.length(); j++) {
                        if (string1.charAt(i) == string2.charAt(j)) {
                            letterEquals = true;
                            break;
                        }
                    }
                    if (!letterEquals) {
                        areCharactersSame = false;
                        difChars.append(string1.charAt(i)).append(" ");
                    }
                }
                if (areCharactersSame) {
                    System.out.println("The second string contains all the characters from the first string.");
                }
                else {
                    System.out.println("The two strings have different characters.");
                    System.out.println("Characters \"" + difChars + "\" are not found in the second string.");
                }

            }

}
