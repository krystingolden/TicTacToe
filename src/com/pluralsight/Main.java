package com.pluralsight;


public class Main {
    /*
    https://programmingbydoing.com/
    TicTacToe - Assignment #152
     */

    private static Board board = new Board();

    private static Player x = new Player('X');
    private static Player o = new Player('O');


    public static void main(String[] args) {

        //Initialize the places on the board and display a blank copy of the board
        board.initBoard();
        board.displayBoard();

        //Play the game until a player wins or it's a tie
        do {
            playGame(x);
            if (board.continueGame(x.getPlayerSymbol())) {
                playGame(o);
            }
        }
        while (board.continueGame(x.getPlayerSymbol()) && board.continueGame(o.getPlayerSymbol()));
    }

    public static void playGame(Player player) {
        //Prompt the player for where they want to place their symbol
        do {
            player.prompt();
        } while (!(board.validatePrompt(player.getRowChoice(), player.getColumnChoice())));

        //Modify the board with the players choice
        board.modifyBoard(player.getRowChoice(), player.getColumnChoice(), player.getPlayerSymbol());
        //Display a new copy of the board
        board.displayBoard();
    }


}


