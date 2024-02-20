package Lesson09Recursion;

import java.util.Scanner;

public class StringTaskAsRecursion {

    public static void main(String[] args) {

        /*
        Write a method that accepts a String variable that holds some text.
The method returns true if there are more lowerCase letters than upperCase letters and false - otherwise.
Use recursion.
         */
        Scanner sc = new Scanner(System.in);
        String initialText = sc.nextLine();

        boolean moreSmallThanCaps = checkSmallOrCaps(initialText, 0, initialText.length(), 0,
                0, 0);
        System.out.println(moreSmallThanCaps);

    }

    private static boolean checkSmallOrCaps(String initialText, int currentSymbolIndex, int textLength,
                                            int smallCounter, int capsCounter, int othersCounter) {
        char currentChar = initialText.charAt(currentSymbolIndex);

        if (currentSymbolIndex == textLength - 1) {
            return(smallCounter > capsCounter);
        } else {
            if(Character.isAlphabetic(currentChar)){
                if (Character.isUpperCase(currentChar)) {
                    capsCounter++;
                } else {
                    smallCounter++;
                }
            } else {
                othersCounter++;
            }
            return checkSmallOrCaps(initialText, ++currentSymbolIndex, textLength, smallCounter, capsCounter, othersCounter);
        }
    }
}
