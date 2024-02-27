import java.util.Scanner;

public class PaintBrushRecursive {
    /*
    Write a method that represents "paint brush" in Paint. The method takes a matrix of pixels N*N and the
    coordinates of a single pixel of the matrix as parameters. We know that the matrix contains areas, surrounded by
    black pixels (marked with the letter 'b' in the cell). The method then paints the while area around the pixel
    that is surrounded by black pixels or that ends with the border of the matrix.
    Painting the area means setting all pixels to red (contain the letter 'r').
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner((System.in));
        char[][] matrix = defineMatrix(sc);

        int xCoordinate = requestStartingCoordinateX(matrix, sc);
        int yCoordinate = requestStartingCoordinateY(matrix, sc, xCoordinate);
        defineMatrixSymbols(matrix, xCoordinate, yCoordinate);

        printMatrix(matrix);
        paintTheMatrix(matrix, xCoordinate, yCoordinate);
        printMatrix(matrix);
    }

    private static char[][] defineMatrix(Scanner sc) {
        int matrixHeight;
        int matrixWidth;
        do {
            System.out.print("Please enter a value, greater than 4 for height of the matrix: ");
            matrixHeight = Integer.parseInt(sc.nextLine());
            System.out.print("Please enter a value, greater than 4 for width of the matrix: ");
            matrixWidth = Integer.parseInt(sc.nextLine());
        } while (matrixHeight < 5 || matrixWidth < 5);
        return new char[matrixHeight][matrixWidth];
    }


    private static void defineMatrixSymbols(char[][] matrix, int x, int y) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0 || i == matrix.length - 1) {
                    matrix[i][j] = '_';
                } else if (j == 0 || j == matrix[i].length - 1) {
                    matrix[i][j] = '|';
                } else if (i == j || i == j+1) {
                    matrix[i][j] = 'b';
                } else {
                    matrix[i][j] = '.';
                }
            }
        }
        matrix[x][y] = 'X';
    }

    private static int requestStartingCoordinateX(char[][] matrix, Scanner sc) {
        int i;
        do {
            System.out.print("Please, enter a value for X coordinate of the starting point between 1 and " +
                    (matrix.length - 1) + ": ");
            i = Integer.parseInt(sc.nextLine());
        }
        while(i < 1 || i > matrix.length - 2);
        return i;
    }

    private static int requestStartingCoordinateY(char[][] matrix, Scanner sc, int i) {
        int j;
        do {
            System.out.print("Please, enter a value for Y coordinate of the starting point between 1 and " +
                    (matrix[i].length - 1) + " that is" +
                    "different from X or from X - 1: ");
            j = Integer.parseInt(sc.nextLine());
        }
        while (j < 1 || j > matrix[i].length - 2 || j == i || j == i - 1);
        return j;
    }

    private static void printMatrix(char[][] matrix) {
        for (char[] chars : matrix) {
            for (char aChar : chars) {
                System.out.print(aChar + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void paintTheMatrix(char[][] matrix, int xCoordinate, int yCoordinate) {
        paintNeighbour(matrix, xCoordinate, yCoordinate);
    }

    private static void paintNeighbour(char[][] matrix, int i, int j) {
        if (cellIsValid(matrix, i, j)) {
            matrix[i][j] = 'r';
            paintNeighbour(matrix, i, j + 1);
            paintNeighbour(matrix, i + 1, j + 1);
            paintNeighbour(matrix, i + 1, j);
            paintNeighbour(matrix, i + 1, j - 1);
            paintNeighbour(matrix, i, j - 1);
            paintNeighbour(matrix, i -1 , j -1);
            paintNeighbour(matrix, i -1 , j);
            paintNeighbour(matrix, i -1, j +1);
        }
    }

    private static boolean cellIsValid(char[][] matrix, int i, int j) {
        return (matrix[i][j] != 'r' && matrix[i][j] != 'b' && i > 0 && i < matrix.length -1 && j > 0 && j < matrix[i].length - 1);
    }
}
