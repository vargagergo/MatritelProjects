package TicTacToe;

import java.util.Scanner;

public class TicTacToeRev {

    final static char[][] grid = {
            { '1', ' ', '2', ' ', '3' },
            { '4', ' ', '5', ' ', '6' },
            { '7', ' ', '8', ' ', '9' }
    };
    private static int player;
    private static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {

        while (isWin()){
            printGrid(grid);
            playerOne();
            printGrid(grid);
            playerTwo();
        }
    }



    private static void resetGrid(){

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                grid[i][j] = ' ';
            }
        }
    }
    public static void printGrid(char[][] grid){
        System.out.println("\u2554\u2550\u2550\u2550\u2550\u2566\u2501\u2550\u2550\u2550\u2566\u2550\u2550\u2550\u2550\u2557");

        for (int i = 0; i < grid.length; i++) {
            System.out.print("  ");
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j]+ " ");
            }
            System.out.println();
            System.out.println("\u2560\u2550\u2550\u2550\u2550\u256c\u2550\u2550\u2550\u2550\u256c\u2550\u2550\u2550\u2550\u2563");
        }


    }
    public static void  playerOne() {
        System.out.println("Player1: ");
        int inp = input.nextInt();
        switch (inp){
            case 1 : if (grid[0][0] == '1'){grid[0][0] = 'X'; break;} else {System.out.println("grid is taken");playerOne();}
                break;
            case 2 : if (grid[0][2] == '2'){grid[0][2] = 'X'; break;} else {System.out.println("grid is taken");playerOne();}
                break;
            case 3 : if (grid[0][4] == '3' ){grid[0][4] = 'X'; break;} else {System.out.println("grid is taken");playerOne();}
                break;
            case 4 : if (grid[1][0] == '4'){grid[1][0] = 'X'; break;} else {System.out.println("grid is taken");playerOne();}
                break;
            case 5 : if (grid[1][2] == '5'){grid[1][2] = 'X'; break;} else {System.out.println("grid is taken");playerOne();}
                break;
            case 6 : if (grid[1][4] == '6'){grid[1][4] = 'X'; break;} else {System.out.println("grid is taken");playerOne();}
                break;
            case 7 : if (grid[2][0] == '7'){grid[2][0] = 'X'; break;} else {System.out.println("grid is taken");playerOne();}
                break;
            case 8 : if (grid[2][2] == '8'){grid[2][2] = 'X'; break;} else {System.out.println("grid is taken");playerOne();}
                break;
            case 9 : if (grid[2][4] == '9'){grid[2][4] = 'X'; break;} else {System.out.println("grid is taken");playerOne();}
                break;
            default:
                System.out.println("Wrong Input!!!");
                playerOne();
        }


    }

    public static void  playerTwo() {
        System.out.println("Player2: ");
        int inp = input.nextInt();
        switch (inp){
            case 1 : if (grid[0][0] == '1'){grid[0][0] = 'O'; break;} else {System.out.println("grid is taken");playerTwo();}
                break;
            case 2 : if (grid[0][2] == '2'){grid[0][2] = 'O'; break;} else {System.out.println("grid is taken");playerTwo();}
                break;
            case 3 : if (grid[0][4] == '3'){grid[0][4] = 'O'; break;} else {System.out.println("grid is taken");playerTwo();}
                break;
            case 4 : if (grid[1][0] == '4'){grid[1][0] = 'O'; break;} else {System.out.println("grid is taken");playerTwo();}
                break;
            case 5 : if (grid[1][2] == '5'){grid[1][2] = 'O'; break;} else {System.out.println("grid is taken");playerTwo();}
                break;
            case 6 : if (grid[1][4] == '6'){grid[1][4] = 'O'; break;} else {System.out.println("grid is taken");playerTwo();}
                break;
            case 7 : if (grid[2][0] == '7'){grid[2][0] = 'O'; break;} else {System.out.println("grid is taken");playerTwo();}
                break;
            case 8 : if (grid[2][2] == '8'){grid[2][2] = 'O'; break;} else {System.out.println("grid is taken");playerTwo();}
                break;
            case 9 : if (grid[2][4] == '9'){grid[2][4] = 'O'; break;} else {System.out.println("grid is taken");playerTwo();}
                break;
            default:
                System.out.println("Wrong Input!!!");
                playerTwo();
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
            if (grid[i][0] == grid [i][2] && grid [i][0] == grid[i][4]){
                    return true;
            }
        }

        return false;
    }
    private static boolean checkColumn(){
        for (int i = 0; i < 3; i++){
            if (grid[0][i] == grid [1][i] && grid [0][i] == grid[2][i]){
                return true;
            }
        }

        return false;
    }
    private static boolean checkDiagonal(){

        if ((grid[1][2] == grid[0][0] && grid[1][2] == grid[2][4]) ||
                (grid[1][2] == grid[0][4] && grid [1][2] == grid[2][0])){
            return true;
        }

        return false;
    }
    private static void winner(int player){
        if (player != 0){
            System.out.println("Player number "+ player + " won! Congrats!!");
        } else {
            System.out.println("draw.....");
        }

    }
}
