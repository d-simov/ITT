package Lesson08StringsAndMethods;

import java.util.Scanner;

public class StringTasks08 {
/*
На някои мобилни телефони английската азбука се получава от
натискане на клавишите по следния начин: ABC(2), DEF(3),
GHI(4), JKL(5), MNO(6), PQRS(7), TUV(8), WXYZ(9).
Напишете програма, която приема последователност от
натискания на клавиши (цифри) и конвертира
последователността към символен низ от английски букви.
 */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter a string of digits: ");
        String digitString = sc.nextLine();

        int symbolCounter = 1;
        for (int i = 1; i < digitString.length(); i++) {
            if (digitString.charAt(i) != digitString.charAt(i - 1)) {
                symbolCounter++;
            }
        }
        String[] numSymbolArray = new String[symbolCounter];
        int[] lengthArray = new int[symbolCounter];
        symbolCounter = 0;
        numSymbolArray[symbolCounter] = "" + digitString.charAt(0);
        int digitCounter = 1;
        for (int i = 1; i < digitString.length(); i++) {
            if (digitString.charAt(i) == digitString.charAt(i - 1)) {
                digitCounter++;
                numSymbolArray[symbolCounter] = numSymbolArray[symbolCounter] + digitString.charAt(i);
            } else {
                lengthArray[symbolCounter] = digitCounter;
                symbolCounter++;
                digitCounter = 1;
                numSymbolArray[symbolCounter] = "" + digitString.charAt(i);
            }
        }
        lengthArray[symbolCounter] = digitCounter;
        for (int i = 0; i < numSymbolArray.length; i++) {
            switch (numSymbolArray[i].charAt(0)) {
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '8':
                    if (lengthArray[i] > 4) {
                        lengthArray[i] = lengthArray[i] % 4;
                    }
                    break;
                case '7':
                case '9':
                    if (lengthArray[i] > 5) {
                        lengthArray[i] = lengthArray[i] % 5;
                    }
                    break;
            }
        }
        String[] symbolArray = new String[numSymbolArray.length];
        for (int i = 0; i < symbolArray.length; i++) {
            switch (numSymbolArray[i].charAt(0)) {
                case '2':
                    switch (lengthArray[i]) {
                        case 1 -> symbolArray[i] = "A";
                        case 2 -> symbolArray[i] = "B";
                        case 3 -> symbolArray[i] = "C";
                        case 4 -> symbolArray[i] = "2";
                    }
                    break;
                case '3':
                    switch (lengthArray[i]) {
                        case 1 -> symbolArray[i] = "D";
                        case 2 -> symbolArray[i] = "E";
                        case 3 -> symbolArray[i] = "F";
                        case 4 -> symbolArray[i] = "3";
                    }
                    break;
                case '4':
                    switch (lengthArray[i]) {
                        case 1 -> symbolArray[i] = "G";
                        case 2 -> symbolArray[i] = "H";
                        case 3 -> symbolArray[i] = "I";
                        case 4 -> symbolArray[i] = "4";
                    }
                    break;
                case '5':
                    switch (lengthArray[i]) {
                        case 1 -> symbolArray[i] = "J";
                        case 2 -> symbolArray[i] = "K";
                        case 3 -> symbolArray[i] = "L";
                        case 4 -> symbolArray[i] = "5";
                    }
                    break;
                case '6':
                    switch (lengthArray[i]) {
                        case 1 -> symbolArray[i] = "M";
                        case 2 -> symbolArray[i] = "N";
                        case 3 -> symbolArray[i] = "O";
                        case 4 -> symbolArray[i] = "6";
                    }
                    break;
                case '7':
                    switch (lengthArray[i]) {
                        case 1 -> symbolArray[i] = "P";
                        case 2 -> symbolArray[i] = "Q";
                        case 3 -> symbolArray[i] = "R";
                        case 4 -> symbolArray[i] = "S";
                        case 5 -> symbolArray[i] = "7";
                    }
                    break;
                case '8':
                    switch (lengthArray[i]) {
                        case 1 -> symbolArray[i] = "T";
                        case 2 -> symbolArray[i] = "U";
                        case 3 -> symbolArray[i] = "V";
                        case 4 -> symbolArray[i] = "8";
                    }
                    break;
                case '9':
                    switch (lengthArray[i]) {
                        case 1 -> symbolArray[i] = "W";
                        case 2 -> symbolArray[i] = "X";
                        case 3 -> symbolArray[i] = "Y";
                        case 4 -> symbolArray[i] = "Z";
                        case 5 -> symbolArray[i] = "9";
                    }
                    break;
            }
        }
        System.out.println();
        for (int i = 0; i < symbolArray.length; i++) {
            System.out.print(symbolArray[i]);
        }
    }
}
