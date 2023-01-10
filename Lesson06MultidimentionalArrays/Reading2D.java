import java.util.Arrays;
import java.util.Scanner;

public class Reading2D {

    public static void main(String[] args) {

        /*
                3,4,6
                1,2,3
                3,3,4
                1,2,3
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me number of rows");
        int rows = sc.nextInt();
        System.out.println("Give me number of columns");
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < matrix.length; i++) {//rows times
            for (int j = 0; j < matrix[i].length; j++) {//columns times
                System.out.println("Please enter a value for cell");
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(matrix));

    }
}
