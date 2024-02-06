import java.util.Scanner;

public class ReturnTextAsSortedArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a word or a sentence:");
        String text = sc.nextLine();

        char[] textAsArray = returnTextAsSortedArray(text);
        printArrayOfChars(textAsArray);

    }

    static char[] returnTextAsSortedArray(String text) {
        char[] array = returnTextAsArray(text);
        printArrayOfChars(array);
        char[] sortedArray = sortArray(array);
        return sortedArray;
    }

    private static void printArrayOfChars(char[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            }
            else {
                System.out.print(array[i] + " _ ");
            }
        }
        System.out.println();
    }

    private static char[] sortArray(char[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    char temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Middle print:");
        printArrayOfChars(array);
        return array;
    }

    private static char[] returnTextAsArray(String text) {
        char[] array = new char[text.length()];
        for (int i = 0; i < array.length; i++) {
            array[i] = text.charAt(i);
        }
        return array;
    }

}
