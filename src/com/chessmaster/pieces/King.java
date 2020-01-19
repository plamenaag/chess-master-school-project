package com.chessmaster.pieces;

public class King {

    public String color;
    public int power;
    public int id;
    public int row;
    public int col;

    public King(String color, int row, int col) {
        this.color = color;
        this.power = 6;
        this.id = 5;
        this.row = row;
        this.col = col;
    }

    public boolean isMoveActionValid(int moveToRow, int moveToCol) {
        if(row == moveToRow && col == moveToCol){
            return false;
        }

        // diagonal move
        if (Math.abs(row - moveToRow) <= 1 && Math.abs(col - moveToCol) <= 1) {
            return true;
        }

        return false;
    }

    public void move(int row, int col) {
        if (isMoveActionValid(row, col)) {

            this.row = row;
            this.col = col;
        }
    }

    public void attack() {

    }

    public void render() {

    }
}