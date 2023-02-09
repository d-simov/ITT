package Lesson08StringsAndMethods;

import java.util.Scanner;

public class StringTasks11Hangman {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word;
        String answer;
        boolean isLegitWord;
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        do {
            do {
                isLegitWord = true;
                System.out.print("Моля, въведете вид животно на български език, с малки букви: ");
                word = sc.nextLine();
                if (word.length() <= 1) {
                    isLegitWord = false;
                }
                else {
                    for (int i = 0; i < word.length(); i++) {
                        if ((word.charAt(i) < 'а' || word.charAt(i) > 'я') && word.charAt(i) != ' ') {
                            isLegitWord = false;
                            break;
                        }
                    }
                }
            } while (!isLegitWord);

            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

            char[][] hangman = new char[9][8];
            fillHangmanMatrix(hangman);

            int tries = 9;
            boolean isAnswerGuessed;
            char[] arrayGuess = createArrayOfDashes(word);
            StringBuilder wrongLetters = new StringBuilder();
            int mistakes = 0;
            System.out.println("Здравейте! Вие играете на \"БЕСЕНИЦА\".");
            System.out.println("Думата, която трябва да познаете е вид животно и е изписана с " + word.length() + " малки букви на български език.");
            System.out.println("Разполагате с " + tries + " възможности за грешен опит.");
            printGuessedWord(arrayGuess);
            printMistakenLetters(wrongLetters);
            printHangMan(hangman, mistakes);
            System.out.println(("\n"));
            do {
                char nextLetter;
                do {
                    System.out.print("Моля, въведете Вашето предположение за буква: ");
                    nextLetter = sc.next().charAt(0);
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                } while (nextLetter < 'а' || nextLetter > 'я');
                sc.nextLine();
                boolean isCharacterGuessed = false;
                boolean guessedAlready = false;

                for (int i = 0; i < word.length(); i++) {
                    if (nextLetter == word.charAt(i)) {
                        isCharacterGuessed = true;
                        arrayGuess[i] = nextLetter;
                        System.out.println("Познахте буква! Буквата \"" + nextLetter + "\" се среща на позиция " + (i + 1) + " в думата.");
                    }
                }

                if (!isCharacterGuessed) {
                    for (int i = 0; i < wrongLetters.length(); i++) {
                        if (nextLetter == wrongLetters.charAt(i)) {
                            guessedAlready = true;
                            break;
                        }
                    }
                    if (guessedAlready) {
                        System.out.print("Вече сте предположили буквата '" + nextLetter + "'. ");
                        System.out.println("Все още Ви остават " + tries + " възможности за грешки.");
                    } else {
                        tries--;
                        mistakes = 9 - tries;
                        wrongLetters.append(nextLetter).append(", ");
                        System.out.println("Буквата \"" + nextLetter + "\" не се съдържа в думата. Остават Ви " + tries + " възможности за грешки.");
                    }
                }
                printGuessedWord(arrayGuess);
                printMistakenLetters(wrongLetters);
                System.out.println(("\n"));
                printHangMan(hangman, mistakes);
                System.out.println(("\n"));


                isAnswerGuessed = (checkIfReady(arrayGuess));

            } while (tries > 0 && !isAnswerGuessed);

            if (isAnswerGuessed) {
                System.out.println("Поздравления! Намисленото животно наистина е \"" + word + "\".\nСпечелихте!");
            } else {
                System.out.println("Съжалявам, загубихте!\nНямате повече опити.\nНамисленото животно е \"" + word + "\".");
            }
            System.out.println();
            do {
                System.out.print("Желаете ли още една игра? \nда / не ?  ");
                answer = sc.nextLine();
            } while (!answer.equalsIgnoreCase("да") && !answer.equalsIgnoreCase("не"));
            if (answer.equalsIgnoreCase("не")) {
                System.out.println("Благодарим Ви за участието. До скоро! :)");
                break;
            }
        } while (answer.equalsIgnoreCase("да"));



    }

    private static void fillHangmanMatrix(char[][] matrix) {
            for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0 || i == matrix.length - 1){
                    matrix[i][j] = '*';
                }
                else if (j == 0 || j == matrix[i].length - 1){
                    matrix[i][j] = '*';
                }
                else {
                    matrix[i][j] = ' ';
                }
            }
        }
    }

    private static void printHangMan(char[][] hangman, int mistakes) {
        switch (mistakes) {
            case 1:
                hangman[2][6] = '\\';
                for (int i = 3; i <= 7; i++) {
                    hangman[i][6] = '|';
                }
                break;
            case 2:
                for (int i = 1; i < 6; i++) {
                    hangman[1][i] = '_';
                }
                break;
            case 3:
                hangman[2][3] = '|';
                break;
            case 4:
                hangman[3][3] = 'O';
                break;
            case 5:
                hangman[4][3] = '|';
                hangman[5][3] = '|';
                break;
            case 6:
                hangman[4][2] = '/';
                break;
            case 7:
                hangman[4][4] = '\\';
                break;
            case 8:
                hangman[6][2] = '/';
                break;
            case 9:
                hangman[6][4] = '\\';
                break;
        }
        for (int i = 0; i < hangman.length; i++) {
            for (int j = 0; j < hangman[i].length; j++) {
                System.out.print(hangman[i][j]);
            }
            System.out.println();
        }
    }

    static char[] createArrayOfDashes(String word) {
        char[] array = new char[word.length()];
        for (int i = 0; i < array.length; i++) {
            if (word.charAt(i) == ' ') {
                array[i] = ' ';
            }
            else {
                array[i] = '_';
            }
        }
        return array;
    }

    static void printGuessedWord(char[] array) {
        System.out.print("ДУМАТА: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static void printMistakenLetters(StringBuilder letters){
        System.out.print("          /           Грешни букви: " + letters);
        System.out.println();
    }

    static boolean checkIfReady(char[] array) {
        boolean isReady = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '_') {
                isReady = false;
                break;
            }
        }
        return isReady;
    }
}
