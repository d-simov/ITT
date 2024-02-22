import java.util.Scanner;

public class FibArrIterative {

    public static void main(String[] args) {

        //        Да се намери N-тото число на Фибоначи - итеративно, с масив.
        Scanner sc = new Scanner((System.in));
        int n;
        do {
            System.out.print("Please, enter a positive number for Fibonacci calculation: ");
            n = sc.nextInt();
        } while (n < 3);

        int[] fibArr = new int[n];
        fibArr[0] = 0;
        fibArr[1] = 1;

        for (int i = 2; i < n; i++) {
            fibArr[i] = fibArr[i-1] + fibArr[i-2];
        }
        System.out.println(fibArr[n-1]);
    }
}
