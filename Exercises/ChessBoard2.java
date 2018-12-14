import java.lang.*;
public class frigoExercise05 {

   /*     >>>>>>>>For testing<<<<<<<<<
     for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(chessBoard[i][j]+" ");
            }
            System.out.println();
        }
    * */



    public static void main(String[] args) {

    }

    public static int[][] board (){
        int[][] board = new int [8][8];
        return board;
    }

    public static int charToValue(char Column) {
        int c = 0;
        switch (Column){
            case 'A' : c=0;
                break;
            case 'B' : c=1;
                break;
            case 'C' : c=2;
                break;
            case 'D' : c=3;
                break;
            case 'E' : c=4;
                break;
            case 'F' : c=5;
                break;
            case 'G' : c =6;
                break;
            case 'H' : c=7;
                break;
        }
        return c;
    }

    public static int [][] setPieceOnSquare(int [][]chessBoard ,char column, int row){
        int c = charToValue(column);
        int rowN = row - 1;

        chessBoard[rowN][c] = 1;
        return chessBoard;


    }

    public static int [][] removePieceOnSquare(int [][]chessBoard ,char column, int row){
        int c = charToValue(column);
        int rowN = row - 1;
        int columnN = c;

        chessBoard[rowN][columnN] = 0;
        return chessBoard;

    }


    public static void clearRow(int[][] theChessBoard, int n){
        theChessBoard = board();

        for (int i = 0; i < board().length; i++) {
            theChessBoard[n][i] = 0;
        }
    }

    public static void clearColumn(int[][] theChessBoard, int n){
        theChessBoard = board();

        for (int i = 0; i < board().length; i++) {
            theChessBoard[i][n] = 0;
        }
    }
    public static void clearBoard(int[][] theChessBoard){
        theChessBoard = board();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                theChessBoard[i][j] = 0;
            }
        }
    }
}
