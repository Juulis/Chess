package com.chess.pieces;

public class Rook implements Piece {
    private int val;
    private char c;
    private String color;
    private int x;
    private int y;
    private int id;

    public Rook(String color, int x, int y, int id){
        this.id = id;
        this.color = color;
        this.x = x;
        this.y = y;
        if (color.equals("white")) {
            c='\u2656';
        }else //black
            c='\u265C';

    }

    @Override
    public int[] getPosition() {
        int[] xy = new int[2];
        xy[0] = x;
        xy[1] = y;
        return xy;
    }

    public int getId(){
        return id;
    }

    @Override
    public int getValue() {
        return 0;
    }
}
