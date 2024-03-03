package Labyrinth;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LabyrinthBasic {

    /*
    Лабиринт от птичи поглед  (изрисуван със символи в двумерен масив) с даден координат някъде в лабиринта.
	- ЛЕСЕН ВАРИАНТ - да се намери изход от лабиринта
	- труден вариант - да се намери най-близкият изход от лабиринта.
     */

    private static List<Indexes> returnIdxList(int i, int j) {
        List<Indexes> indexList = new ArrayList<>(4);
        indexList.add(new Indexes(i-1, j));
        indexList.add(new Indexes(i, j+1));
        indexList.add(new Indexes(i+1, j));
        indexList.add(new Indexes(i, j-1));
        return indexList;
    }

    public static void main(String[] args) {

        char[][] labyrinth = {
                {'0', '0', ' ', '0', '0', '0', '0', '0', '0', '0', '0', ' ', '0', '0', '0'},
                {'0', ' ', ' ', '0', '0', ' ', ' ', ' ', '0', '0', '0', ' ', ' ', '0', '0'},
                {'0', ' ', '0', '0', '0', ' ', '0', ' ', ' ', ' ', '0', '0', ' ', ' ', '0'},
                {'0', ' ', ' ', '0', '0', ' ', '0', '0', '0', ' ', '0', '0', '0', ' ', '0'},
                {'0', '0', ' ', '0', ' ', ' ', ' ', '0', ' ', ' ', '0', '0', '0', ' ', '0'},
                {'0', '0', ' ', '0', ' ', 'x', ' ', '0', ' ', '0', '0', ' ', '0', ' ', '0'},
                {'0', ' ', ' ', '0', ' ', ' ', ' ', '0', ' ', ' ', '0', ' ', ' ', ' ', '0'},
                {'0', ' ', '0', '0', ' ', '0', '0', '0', '0', ' ', '0', '0', '0', ' ', '0'},
                {'0', ' ', ' ', '0', ' ', '0', ' ', ' ', ' ', ' ', ' ', ' ', '0', ' ', '0'},
                {'0', '0', ' ', '0', ' ', '0', ' ', '0', '0', '0', ' ', '0', '0', ' ', '0'},
                {'0', '0', ' ', '0', ' ', '0', '0', '0', '0', '0', ' ', '0', ' ', ' ', '0'},
                {'0', '0', ' ', ' ', ' ', '0', '0', ' ', ' ', ' ', ' ', '0', '0', ' ', '0'},
                {'0', ' ', ' ', '0', '0', '0', '0', ' ', '0', '0', ' ', ' ', ' ', ' ', '0'},
                {' ', ' ', '0', '0', ' ', '0', ' ', ' ', '0', '0', '0', '0', '0', ' ', ' '},
                {'0', '0', '0', '0', ' ', '0', ' ', '0', '0', '0', '0', '0', '0', '0', '0'}
        };

        char startingPoint = labyrinth[5][5];

        printLabyrinth(labyrinth);
        if (makeNextStep(labyrinth, 5, 5)) {
            System.out.println("You have successfully exited the maze. ");
        }
        else {
            System.out.println("The maze has no exit.");
        }
    }

    private static boolean makeNextStep(char[][] labyrinth, int i, int j) {
        boolean foundExit = false;
        labyrinth[i][j] = 'X';
        printLabyrinth(labyrinth);
        if(i == 0 || j == 0 || i == labyrinth.length - 1 || j == labyrinth[i].length - 1){
            foundExit = true;
        }

        for (Indexes idx: returnIdxList(i, j)
             ) {
            if (!foundExit && isValid(labyrinth, idx.getIdx1(), idx.getIdx2())) {
                foundExit =  makeNextStep(labyrinth, idx.getIdx1(), idx.getIdx2());
            }
        }
//        if (!foundExit && isValid(labyrinth, i-1, j)) {
//            foundExit =  makeNextStep(labyrinth, i-1, j);
//        }
//        if (!foundExit && isValid(labyrinth, i, j+1)) {
//            foundExit = makeNextStep(labyrinth, i, j+1);
//        }
//        if (!foundExit && isValid(labyrinth, i+1, j)) {
//            foundExit = makeNextStep(labyrinth, i+1, j);
//        }
//        if (!foundExit && isValid(labyrinth, i, j-1)) {
//            foundExit = makeNextStep(labyrinth, i, j-1);
//        }
        return foundExit;
    }

    private static boolean isValid(char[][] matrix, int i, int j) {
        return i >= 0 && i < matrix.length && j >= 0 && j < matrix[i].length && matrix[i][j] != '0' && matrix[i][j] != 'X';
    }

    private static void printLabyrinth(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
