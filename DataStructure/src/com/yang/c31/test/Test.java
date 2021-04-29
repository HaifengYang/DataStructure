package com.yang.c31.test;

import com.yang.c31.entity.GameEntry;
import com.yang.c31.entity.ScoreBoard;

public class Test {
    public static void main(String[] args) {
        GameEntry g1= new GameEntry("LOL", 70);
        GameEntry g2 = new GameEntry("LOL", 91);
        GameEntry g3= new GameEntry("LOL", 80);
        GameEntry g4= new GameEntry("LOL", 95);
        GameEntry g5 = new GameEntry("LOL", 90);

        ScoreBoard scoreBoard = new ScoreBoard(3);
        scoreBoard.add(g4);
        scoreBoard.add(g3);
        scoreBoard.add(g5);
        scoreBoard.add(g2);
        scoreBoard.add(g1);

        scoreBoard.remove(2);
        scoreBoard.add(g1);
        scoreBoard.print();
    }
}
