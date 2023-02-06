package Lesson08StringsAndMethods;

import java.util.Scanner;

public class StringTasks05 {

/*
Напишете програма, която проверява дали даден символен низ
е анаграма (съдържа същите символи, но не задължително в
същия ред) на друг символен низ.
 */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter one word or sentence for TEXT1: ");
        String text1 = sc.nextLine();
        System.out.print("Please, enter one word or sentence for TEXT2: ");
        String text2 = sc.nextLine();

        if (testIfAnagram(text1, text2)) {
            System.out.println("TEXT1 is an anagram for TEXT2.");
        }
        else {
            System.out.println("TEXT1 is NOT an anagram for TEXT2.");
        }

    }

    static boolean testIfAnagram(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }
        else {
            for (int i = 0; i < string1.length(); i++) {
                int counter1 = 0;
                int counter2 = 0;
                for (int j = 0; j < string2.length(); j++) {
                    if (string1.charAt(i) == string2.charAt(j)) {
                        counter1++;
                    }
                    /*
                    I worked with one counter and in the last conditional statement (row 44) I would return false if counter != 1.
                    It worked most of the cases, but I found a bug: "лебед" и "дебел" - counter hits 2 and returns FALSE.
                    So I added a break after the counter incrementation, and it worked. For a time. "ллллл" and "лебед" returned TRUE.
                    I had to remove the break but check the two words with one another, adding a second counter.
                    It should be bulletproof now.
                    Better ideas?
                     */
                    if (string2.charAt(i) == string1.charAt(j)) {
                        counter2++;
                    }
                }
                if (counter1 == 0 || counter2 != counter1) {
                    return false;
                }
            }
        }
        return true;
    }
}
