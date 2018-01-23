package com.chess;

import com.chess.pieces.Piece;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.swing.SwingTerminalFontConfiguration;

import java.awt.*;
import java.io.IOException;

public class Board {
    private Terminal t;
    private Player p1;
    private Player p2;

    public Board(Player p1, Player p2) throws IOException {
        this.p1 = p1;
        this.p2 = p2;


        Font myFont = new Font("Monospaced", Font.PLAIN, 90);
        SwingTerminalFontConfiguration cfg = SwingTerminalFontConfiguration.newInstance(myFont);
        t = new DefaultTerminalFactory().setTerminalEmulatorFontConfiguration(cfg).setInitialTerminalSize(new TerminalSize(8, 8)).createTerminal();
        t.setCursorVisible(false);

        paintBoard();
    }

    public Terminal getBoard() {
        return t;
    }


    public void paintBoard() throws IOException {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i % 2 == 1 && j % 2 == 1)
                        //) {
                        || (i % 2 == 0 && j % 2 == 0)) {
                    t.setCursorPosition(i, j);
                    t.setBackgroundColor(TextColor.Indexed.fromRGB(255, 255, 255));
                    char c = t.newTextGraphics().getCharacter(i, j).getCharacter();
                    t.putCharacter(c);
                    t.resetColorAndSGR();
                }
            }
        }
    }

    public void paintPieces() throws IOException {
        int[] coord = new int[2];

        Piece[][] pieces = p1.getPieces();
        for (Piece[] pp : pieces) {
            for(Piece p: pp)
            coord = p.getPosition();
            t.setCursorPosition(coord[0], coord[1]);
        }

        pieces = p2.getPieces();
        for (Piece[] pp : pieces) {
            for(Piece p: pp)
                coord = p.getPosition();
            t.setCursorPosition(coord[0], coord[1]);
        }
    }
}
