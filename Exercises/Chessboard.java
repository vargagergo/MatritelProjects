import java.util.*;
import java.lang.*;

public class forTesting {



    public static int [][]board(){

        int[][] board = new int [8][8];


        return board;
    }


    public static void main(String[] args) {

        int [][] theChessBoard = board();

        for (int i = 0; i < board().length; i++) {
            theChessBoard[i][7] = 1;
        }


        for (int i = 0; i < board().length; i++) {
            theChessBoard[i][6] = 1;
        }

        for (int i = 0; i < board().length; i++) {
            theChessBoard[5][i] = 1;
        }
            for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(theChessBoard[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("newLine");

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                theChessBoard[i][j] = 0;
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(theChessBoard[i][j]+" ");
            }
            System.out.println();
        }

    }








    }

