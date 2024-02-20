package Lesson09Recursion;

public class LoopTask12AsRecursion {

    public static void main(String[] args) {

        /* Да се състави програма, която извежда всички естествени трицифрени числа, които нямат еднакви цифри т.е.
100, 101, 606 и т.н. не се извеждат.
         */

        printNonRepeatingDigits(100, 1000);
    }

    private static void printNonRepeatingDigits(int startingNumber, int endingNumber) {
        if (startingNumber == endingNumber){
            return;
        }
        int currentNumber = startingNumber;
        int digit1 = currentNumber / 100;
        int digit2 = (currentNumber / 10) % 10;
        int digit3 = currentNumber % 10;

        if (digit1 != digit2 && digit1 != digit3 && digit2 != digit3) {
            System.out.println(currentNumber);
        }
        printNonRepeatingDigits(++startingNumber, endingNumber);
    }
}
