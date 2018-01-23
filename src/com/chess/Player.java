package com.chess;

import com.chess.pieces.Piece;
import com.chess.pieces.Rook;

public class Player {
    private Piece[][] pieces;
    private String color;

    Player(String color) {
        this.color = color;

        pieces = new Piece[8][2];

        pieces[0][0]= new Rook(color, 2, 3, 1);

    }

    public Piece[][] getPieces() {
        return pieces;
    }

    public void removePiece(int p) {
       //some code here
        for (int i = 0; i < pieces.length; i++) {
            for (int j = 0; j < pieces[1].length; j++) {

            }

        }

    }
}
