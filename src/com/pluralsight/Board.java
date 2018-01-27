package com.pluralsight;

public class Board {
    private static char[][] board = new char[3][3];

    public void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }


    public void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }

    public boolean validatePrompt(int row, int column){
        if(board[row][column] == ' '){
            return true;
        }else{
            System.out.println("That spot has already been claimed. Try again");
            return false;
        }
    }

    public void modifyBoard(int row, int column, char playerSymbol) {
        board[row][column] = playerSymbol;
    }

    public boolean continueGame(char playerSymbol) {
        if (board[0][0] == playerSymbol && board[1][0] == playerSymbol && board[2][0] == playerSymbol) {
            getPlayerMessage(playerSymbol);
            return false;
        } else if (board[0][1] == playerSymbol && board[1][1] == playerSymbol && board[2][1] == playerSymbol) {
            getPlayerMessage(playerSymbol);
            return false;
        } else if (board[0][2] == playerSymbol && board[1][2] == playerSymbol && board[2][2] == playerSymbol) {
            getPlayerMessage(playerSymbol);
            return false;
        } else if (board[0][0] == playerSymbol && board[0][1] == playerSymbol && board[0][2] == playerSymbol) {
            getPlayerMessage(playerSymbol);
            return false;
        } else if (board[1][0] == playerSymbol && board[1][1] == playerSymbol && board[1][2] == playerSymbol) {
            getPlayerMessage(playerSymbol);
            return false;
        } else if (board[2][0] == playerSymbol && board[2][1] == playerSymbol && board[2][2] == playerSymbol) {
            getPlayerMessage(playerSymbol);
            return false;
        } else if (board[0][0] == playerSymbol && board[1][1] == playerSymbol && board[2][2] == playerSymbol) {
            getPlayerMessage(playerSymbol);
            return false;
        } else if (board[2][0] == playerSymbol && board[1][1] == playerSymbol && board[0][2] == playerSymbol) {
            getPlayerMessage(playerSymbol);
            return false;
        } else if (board[0][0] != ' ' && board[0][1] != ' ' && board[0][2] != ' ' &&
                board[1][0] != ' ' && board[1][1] != ' ' && board[1][2] != ' ' &&
                board[2][0] != ' ' && board[2][1] != ' ' && board[2][2] != ' ') {
            System.out.println("Tie game!");
            return false;
        } else {
            return true;
        }
    }

    public void getPlayerMessage(char playerSymbol) {
        System.out.println("Player " + playerSymbol + " wins!");
    }
}
