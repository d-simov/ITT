import java.util.Scanner;

public class FIbVarIterative {

    public static void main(String[] args) {

//        Да се намери N-тото число на Фибоначи - итеративно, с променливи.

        Scanner sc = new Scanner((System.in));
        int n;
        do {
            System.out.print("Please, enter a positive number for Fibonacci calculation: ");
            n = sc.nextInt();
        } while (n < 3);
        int currentNumberMinusOne = 0;
        int currentNumber = 1;
        int nextNumber = 1;

        for (int i = 1; i < n-1; i++) {
            nextNumber = currentNumber + currentNumberMinusOne;
            currentNumberMinusOne = currentNumber;
            currentNumber = nextNumber;
        }
        System.out.println(nextNumber);
    }
}
