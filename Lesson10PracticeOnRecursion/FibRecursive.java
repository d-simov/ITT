import java.util.Scanner;

public class FibRecursive {

    public static void main(String[] args) {

        //        Да се намери N-тото число на Фибоначи - рекурсивно.
        Scanner sc = new Scanner((System.in));
        int n;
        do {
            System.out.print("Please, enter a positive number for Fibonacci calculation: ");
            n = sc.nextInt();
        } while (n < 3);

        System.out.println(fibRecursion(n));
    }

    private static int fibRecursion(int n) {
        if(n == 2){
            return 1;
        }
        if(n == 1){
            return 0;
        }

        return fibRecursion(n-1) + fibRecursion(n-2);
    }
}
