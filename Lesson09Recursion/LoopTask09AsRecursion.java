package Lesson09Recursion;

import java.util.Scanner;

public class LoopTask09AsRecursion {

    public static void main(String[] args) {
/*      Да се прочетат 2 числа от клавиатурата А и В.
        Да се изведат всички числа от А до В на степен 2(разделени с
        запетая).Ако някое число е кратно на 3, да се изведе съобщение че
        числото се пропуска „skip 3“.Ако сумата от всички изведени числа (без
        пропуснатите) стане по-голяма от 200, да се прекрати извеждането.
 */
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter the first number: ");
        int firstNum = sc.nextInt();
        System.out.print("Please, enter the second number: ");
        int secondNum = sc.nextInt();
        int sumOfSquares = 0;

        if(firstNum > secondNum) {
            int temp = secondNum;
            secondNum = firstNum;
            firstNum = temp;
        }

        printSquare(firstNum, secondNum, sumOfSquares);
    }

    private static void printSquare(int firstNum, int secondNum, int sum) {
        if (sum > 200) {
            return;
        }
        if (firstNum == secondNum){
            return;
        }
        if (firstNum % 3 == 0) {
            System.out.print("skip 3, ");
        }
        else {
            int newSquare = firstNum * firstNum;
            System.out.print(newSquare + ", ");
            sum += newSquare;
        }
        printSquare(++firstNum, secondNum, sum);
    }
}
