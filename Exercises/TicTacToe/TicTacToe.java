package TicTacToe;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class TicTacToe {

    private static char[][] grid = new char[3][3];
    private static int player;
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<int[]> moveMemory = new ArrayList<int[]>();




    public TicTacToe(char[][] board) {
    }


    public static char[][] getGrid() {
        return grid;
    }

    public static void run(){
        while(true){
            setUp();

            for (player = 1; player <= 2; player++){

                putObject(player, grid);
                printGrid(grid);
                if (isWin()) break;
                if (gridIsFull()){
                    player = 0;
                    break;
                }

                if (player == 2){
                    player = 0;
                }
            }

            winner(player);


            if (!wantToRestart()){
                System.out.println("thanks for playing!");
                break;
            }

        }

        input.close();


    }

    private static void setUp(){
        resetGrid();
        resetMoveMemory();
        instruction();

    }

    private static void instruction(){

        System.out.println("Welcome to a 2-player tic tac toe game.");
        System.out.println("How to play: In turn, each player will type in 2 numbers ");
        System.out.println("(row and column) where the O or the X will be placed.");
        System.out.println("Player 1 will be an O and Player 2 will an X");
        System.out.println("Example: When player 1 typed in \"2 2\", an O will be placed in row 2 and column 2");
        System.out.println("");
        printGrid(grid);
    }

    private static void resetGrid(){

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                grid[i][j] = ' ';
            }
        }
    }

    private static void resetMoveMemory(){
        moveMemory.clear();
    }


    private static void putObject(int player, char[][] grid){
        char object = '\u0000';

        if (player == 1){
            object = '\u25ef';
        } else if (player == 2){
            object = '\u2573';
        }

        int[] move = getPlayerMove(player);
        int row = move[0];
        int column = move[1];

        grid[row][column] = object;
        updateMoveMemory(row, column);
    }


    private static int[] getPlayerMove(int player){

        int[] move = new int[2];

        while (true){
            System.out.println("");
            System.out.println("Player " + player + " turn. Select your move:" );
            String moveString = input.nextLine();

            if (moveString.equals("grid")){
                printGrid(grid);
            }
            else if (isValidInput(moveString)){
                move = convertToMoveArray(moveString);

                if (!moveIsDuplicate(move)){
                    break;
                }

            } else {
                System.out.println("invalid move");
            }
        }

        return move;
    }

    private static void updateMoveMemory(int row, int column){
        int[] myArray = new int[2];
        myArray[0] = row;
        myArray[1] = column;
        moveMemory.add(myArray);
    }

    private static boolean isValidInput(String str){
        StringTokenizer st = new StringTokenizer(str);
        for (int i = 0; i < 2; i++){

            try
            { int myNumber = Integer.parseInt(st.nextToken());
                if (!(myNumber >= 1 && myNumber <= 3)){
                    return false;
                }
            }

            catch(NumberFormatException er)
            { return false; }

        }

        if (st.hasMoreTokens()) {
            return false;
        }
        return true;

    }

    private static boolean moveIsDuplicate(int[] move){
        for (int i = 0; i < moveMemory.size(); i++){
            if (moveMemory.get(i)[0] == move[0] && moveMemory.get(i)[1] == move[1]){
                System.out.println("grid is taken");
                return true;
            }
        }


        return false;

    }

    private static int[] convertToMoveArray(String str){
        int [] move = new int[2];
        StringTokenizer st = new StringTokenizer(str);

        for (int i = 0; i < 2; i++){
            move[i] = Integer.parseInt(st.nextToken());
            move[i]--;
        }



        return move;
    }
    public static void printGrid(char[][] grid){
        System.out.println("\u2554\u2550\u2550\u2550\u2550\u2566\u2501\u2550\u2550\u2550\u2566\u2550\u2550\u2550\u2550\u2557");

        for (int i = 0; i < 3; i++) {
            System.out.print("  ");
            for (int j = 0; j < 3; j++) {
                System.out.print(grid[i][j] + "  ");
            }
            System.out.println();
            System.out.println("\u2560\u2550\u2550\u2550\u2550\u256c\u2550\u2550\u2550\u2550\u256c\u2550\u2550\u2550\u2550\u2563");
        }
    }


    private static boolean isWin(){

        if (checkRow()) return true;
        if (checkColumn()) return true;
        if (checkDiagonal()) return true;
        return false;

    }

    private static boolean checkRow(){
        for (int i = 0; i < 3; i++){
            if (grid[i][0] == grid [i][1] && grid [i][0] == grid[i][2]){
                if (grid[i][0] != ' ')
                    return true;
            }
        }

        return false;
    }

    private static boolean checkColumn(){
        for (int i = 0; i < 3; i++){
            if (grid[0][i] == grid [1][i] && grid [0][i] == grid[2][i]){
                if (grid[0][i] != ' ') return true;
            }
        }

        return false;
    }

    private static boolean checkDiagonal(){

        if ((grid[1][1] == grid[0][0] && grid[1][1] == grid[2][2]) ||
                (grid[1][1] == grid[0][2] && grid [1][1] == grid[2][0])){
            if (grid[1][1] != ' ') return true;
        }

        return false;
    }

    private static boolean gridIsFull(){
        if (moveMemory.size() == Math.pow(3, 2)){
            return true;
        }
        return false;
    }

    private static boolean wantToRestart(){

        while(true){

            System.out.println("type (restart) to play again or type (exit) to quit:");

            String str = input.nextLine();

            if (str.equals("restart")){
                return true;
            }
            else if (str.equals("exit")){
                return false;
            } else {
                System.out.println("invalid command");
            }

        }
    }

    private static void winner(int player){
        if (player != 0){
            System.out.println("Player number "+ player + " won! Congrats!!");
        } else {
            System.out.println("draw.....");
        }

    }


    


    
}

