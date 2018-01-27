package com.pluralsight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {

    private int rowChoice;
    private int columnChoice;
    private char playerSymbol;

    public Player(char playerSymbol){
        this.playerSymbol = playerSymbol;
    }

    public char getPlayerSymbol(){
        return this.playerSymbol;
    }

    public void prompt(){
        //Prompt user for their turn
        Scanner keyboard = new Scanner(System.in);

        do {
            try {
                System.out.println("Player " + this.playerSymbol + " choose your location (row, column): ");
                String userMove = keyboard.nextLine();

                this.rowChoice = Character.getNumericValue(userMove.charAt(0));
                this.columnChoice = Character.getNumericValue(userMove.charAt(userMove.length()-1));

                if (rowChoice == 0 || rowChoice == 1 || rowChoice == 2) {
                    if (columnChoice == 0 || columnChoice == 1 || columnChoice == 2) {
                        break;
                    } else {
                        System.out.println("Column must be a number between 0 and 2");
                    }
                } else {
                    System.out.println("Row must be a number between 0 and 2");
                }

            } catch (InputMismatchException e) {
                System.out.println("Must be a number between 0 and 2. Try again");
                keyboard.next();
            }
        }while (true);
    }

    public int getRowChoice(){
        return this.rowChoice;
    }

    public int getColumnChoice(){
        return this.columnChoice;
    }
}
