public class ChessRecursive {
    /*
    Шахматна дъска с царица - замръзнала. На няколко позиции има свои пешки, на една позиция има противников кон.
    Ще може ли някога конят, след безкрайни последователни ходове да вземе царицата?
     */
    public static void main(String[] args) {
        char[][] chessBoard = {
                {'_','_','_','_','_','_','_','_'},
                {'p','Q','_','p','_','_','_','_'},
                {'_','p','_','_','_','_','p','_'},
                {'_','_','p','_','p','_','_','_'},
                {'_','p','_','_','_','_','_','_'},
                {'_','_','_','_','_','_','_','p'},
                {'_','_','_','_','_','K','_','_'},
                {'_','_','_','_','_','_','_','_'}
        };

        // define chessBoard
        //      -> give random Q position
        //      -> give random K position -> different from Q position
        //      -> give 8 random 'p' positions, different from Q and K
        chessBoard[1][1] = 'Q';
        chessBoard[6][5] = 'K';

        printBoard(chessBoard);
        makePossibleKnightMoves(chessBoard, 6, 5, false, 0);


        // if position Q -> END -> You WIN
        // else -> mark new position as K
        // REPEAT
        // if all possible moves are not valid - You FAIL
    }

    private static void printBoard(char[][] chessBoard) {
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                System.out.print(chessBoard[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void makePossibleKnightMoves(char[][] chessBoard, int i, int j, boolean queenIsTaken, int unsuccessfulMoves) {
        moveKnight(chessBoard, i-2, j+1, false, unsuccessfulMoves);
        moveKnight(chessBoard, i-1, j+2, false, unsuccessfulMoves);
        moveKnight(chessBoard, i+1, j+2, false, unsuccessfulMoves);
        moveKnight(chessBoard, i+2, j+1, false, unsuccessfulMoves);
        moveKnight(chessBoard, i+2, j-1, false, unsuccessfulMoves);
        moveKnight(chessBoard, i+1, j-2, false, unsuccessfulMoves);
        moveKnight(chessBoard, i-1, j-2, false, unsuccessfulMoves);
        moveKnight(chessBoard, i-2, j-1, false, unsuccessfulMoves);
        printBoard(chessBoard);
        if (queenIsTaken) {
            System.out.println("YOU WIN!");
            return;
        }
        if (unsuccessfulMoves >= 8) {
            System.out.println("The Queen can not be taken!");
            return;
        }

    }

    private static void moveKnight(char[][] chessBoard, int i, int j, boolean queenIsTaken, int unsuccessfulMoves) {
        if(validMove(chessBoard, i, j)) {
            if(chessBoard[i][j] == 'Q'){
                System.out.println("You successfully took over the enemy Queen!");
                queenIsTaken = true;
                return;
            }
            else {
                chessBoard[i][j] = 'K';
                makePossibleKnightMoves(chessBoard, i, j, false, 0);
            }
        }
        else {
            ++unsuccessfulMoves;
        }
    }

    private static boolean validMove(char[][] chessBoard, int i, int j) {
        return (((i >= 0 && i < 8) && (j >= 0 && j < 8)) && chessBoard[i][j] != 'p' && chessBoard[i][j] != 'K');
    }
}
