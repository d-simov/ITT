import java.util.Scanner;

public class LoopTask15AsRealRecursion {

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
        System.out.println("The sym of the first " + n + " numbers is " + findSum(n));
    }

    private static int findSum(int n) {
        if(n == 1) {
            return 1;
        }
        return n + findSum(n-1);
    }
}
