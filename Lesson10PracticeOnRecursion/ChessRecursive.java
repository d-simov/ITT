package Lesson08StringsAndMethods;

public class ChessRecursive {
    /*
    Шахматна дъска с царица - замръзнала. На няколко позиции има свои пешки, на една позиция има противников кон.
    Ще може ли някога конят, след безкрайни последователни ходове да вземе царицата?
     */
    public static void main(String[] args) {

        char[][] chessBoard = {
                {'_', '_', '_', '_', '_', '_', '_', '_'},
                {'p', 'Q', '_', 'p', '_', '_', '_', '_'},
                {'_', 'p', '_', '_', '_', '_', 'p', '_'},
                {'_', '_', '_', '_', 'p', '_', 'p', '_'},
                {'_', 'p', '_', 'p', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_', 'X', '_', '_'},
                {'_', '_', '_', '_', '_', '_', '_', 'p'},
                {'_', '_', '_', '_', '_', '_', 'p', '_'}
        };

        chessBoard[1][1] = 'Q';


        if (moveKnight(chessBoard, 5, 5)) {
            System.out.println("Success!");
        }
        else {
            System.out.println("Failure.");
        }
    }
    private static void printBoard(char[][] chessBoard) {
        for (char[] chars : chessBoard) {
            for (char aChar : chars) {
                System.out.print(aChar + ", ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static boolean moveKnight(char[][] chessBoard, int i, int j) {
        boolean isQueenTaken = false;
        printBoard(chessBoard);
        if (!outOfBound(i, j)) {
            if (chessBoard[i][j] == 'Q') {
                System.out.println("You successfully took over the enemy Queen!");
                isQueenTaken = true;
            }
        }
        chessBoard[i][j] = 'K';
        if (!isQueenTaken && validMove(chessBoard, i - 2, j + 1)) {
            isQueenTaken = moveKnight(chessBoard, i - 2, j + 1);
        }
        if (!isQueenTaken && validMove(chessBoard, i - 1, j + 2)) {
            isQueenTaken = moveKnight(chessBoard, i - 1, j + 2);
        }
        if (!isQueenTaken && validMove(chessBoard,i + 1, j + 2)) {
            isQueenTaken = moveKnight(chessBoard, i + 1, j + 2);
        }
        if (!isQueenTaken && validMove(chessBoard,i + 2, j + 1)) {
            isQueenTaken = moveKnight(chessBoard, i + 2, j + 1);
        }
        if (!isQueenTaken && validMove(chessBoard, i + 2, j - 1)) {
            isQueenTaken = moveKnight(chessBoard, i + 2, j - 1);
        }
        if (!isQueenTaken && validMove(chessBoard, i + 1, j - 2)) {
            isQueenTaken = moveKnight(chessBoard, i + 1, j - 2);
        }
        if (!isQueenTaken && validMove(chessBoard, i - 1, j - 2)) {
            isQueenTaken = moveKnight(chessBoard, i - 1, j - 2);
        }
        if (!isQueenTaken && validMove(chessBoard, i - 2, j - 1)) {
            isQueenTaken = moveKnight(chessBoard, i - 2, j - 1);
        }

        if (!isQueenTaken) {
            chessBoard[i][j] = '_';
        }
        return isQueenTaken;

    }

    private static boolean outOfBound(int i, int j) {
        return i < 0 || i >= 8 || j < 0 || j >= 8;
    }

    private static boolean validMove(char[][] chessBoard, int i, int j) {
        return !outOfBound(i, j) && chessBoard[i][j] != 'p' && chessBoard[i][j] != 'K';
    }
}
