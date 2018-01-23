package com.chess;

import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;
import java.util.Scanner;

public class Game {
    private Scanner in = new Scanner(System.in);

    public void runGame() throws IOException {
        Player p1 = new Player("white");
        Player p2 = new Player("black");
        Board b = new Board(p1,p2);
        Terminal t = b.getBoard();
        int moveCount = 0;
        boolean running=true;
        String input;
        while (running) {


            //gamecode here?







            b.paintBoard();
            b.paintPieces();
            t.flush();

            moveCount++;
            System.out.println("move: "+moveCount);

            input = in.nextLine();
            if(input.equals("exit")){
                running=false;
            }
        }
    }



}
