package com.chess.pieces;

public class Queen implements Piece {
    private int val;
    private char c;
    private String color;
    private int x;
    private int y;

    @Override
    public int[] getPosition() {
        return new int[0];
    }



    @Override
    public int getValue() {
        return 0;
    }

    @Override
    public int getId() {
        return 0;
    }
}
