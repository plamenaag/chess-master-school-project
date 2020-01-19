package com.chessmaster.pieces;

public class Queen {

    public String color;
    public int power;
    public int id;

    public int row;
    public int col;

    public Queen(String color, int row, int col) {
        this.color = color;
        this.power = 10;
        this.id = 6;
        this.row = row;
        this.col = col;
    }

    public boolean isMoveActionValid(int moveToRow, int moveToCol) {
        if(row == moveToRow && col == moveToCol){
            return false;
        }

        if (Math.abs(row - moveToRow) == Math.abs(col - moveToCol)) {
            return true;
        }

        // col move
        if (row == moveToRow && col != moveToCol) {
            return true;
        }
        //row move
        if (row != moveToRow && col == moveToCol) {
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