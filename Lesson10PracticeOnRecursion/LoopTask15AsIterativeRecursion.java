import java.util.Scanner;

public class LoopTask15AsIterativeRecursion {

    public static void main(String[] args) {
        /* Да се състави програма, която да изчисли сумата на всички числа от 1 до въведено число N.
            Пример: 5
            Изход: 15
         */
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("\nPlease, enter a positive number, greater than 2: ");
            n = Integer.parseInt(sc.nextLine());
        } while (n < 3);
        int totalSum = returnSumOfNumbers(1, n, 0);
        System.out.println(totalSum);

    }

    private static int returnSumOfNumbers(int startingNumber, int endingNumber, int sum) {
        if (startingNumber > endingNumber) {
            return sum;
        }
        sum += startingNumber;
        return returnSumOfNumbers(startingNumber + 1, endingNumber, sum);
    }
}
