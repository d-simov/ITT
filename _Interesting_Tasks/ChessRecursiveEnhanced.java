import java.util.Random;

public class ChessRecursiveEnhanced {

    public static void main(String[] args) {

        int boardSideLength = 8;
        char[][] chessBoard = new char[boardSideLength][boardSideLength];
        Random r = new Random();
        int knightX = r.nextInt(8);
        int knightY = r.nextInt(8);

        drawChessBoard(chessBoard, knightX, knightY, r);

        if (moveKnight(chessBoard, knightX, knightY)) {
            System.out.println("Success!");
        }
        else {
            System.out.println("Failure.");
        }


    }

    private static boolean moveKnight(char[][] chessBoard, int i, int j) {
        boolean isQueenTaken = false;
        printBoard(chessBoard);
        if (inBound(i, j)) {
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

    private static boolean inBound(int i, int j) {
        return i >= 0 && i < 8 && j >= 0 && j < 8;
    }

    private static boolean validMove(char[][] chessBoard, int i, int j) {
        return inBound(i, j) && chessBoard[i][j] != 'p' && chessBoard[i][j] != 'K';
    }

    private static void drawChessBoard(char[][] chessBoard, int x, int y, Random rand) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                chessBoard[i][j] = '_';
            }
        }

        chessBoard[x][y] = 'X';

        do {
            x = rand.nextInt(8);
            y = rand.nextInt(8);
        } while (chessBoard[x][y] == 'X');
        chessBoard[x][y] = 'Q';
        for (int i = 0; i < 8; i++) {
            int pawnX;
            int pawnY;
            do {
                pawnX = rand.nextInt(8);
                pawnY = rand.nextInt(8);
            } while (chessBoard[pawnX][pawnY] != '_');
            chessBoard[pawnX][pawnY] = 'p';
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
}

