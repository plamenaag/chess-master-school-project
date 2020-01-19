package com.chessmaster.pieces;

public class Pawn {

    public String color;
    public int power;
    public int id;

    public int row;
    public int col;
    public boolean hasMoved;

    public Pawn(String color, int row, int col) {
        this.color = color;
        this.power = 1;
        this.id = 1;

        this.row = row;
        this.col = col;
        this.hasMoved = false;
    }

    public boolean isMoveActionValid(int moveToRow, int moveToCol) {
        if(row == moveToRow && col == moveToCol){
            return false;
        }

        if (!hasMoved && col == moveToCol && (Math.abs(row - moveToRow) == 1 || Math.abs(row - moveToRow) == 2)) {
            return true;
        }

        if (hasMoved && col == moveToCol && Math.abs(row - moveToRow) == 1) {
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
