package com.yang.c31.entity;

public class ScoreBoard {
    //数组中现有的entry数目
    private int entryNum;
    //数组
    private GameEntry[] highScores;

    //初始化数组
    public ScoreBoard(int capacity) {
        this.highScores = new GameEntry[capacity];
    }

    //数组中增加entry
    public void add (GameEntry entry) {
        if (entryNum < highScores.length || entry.getScore() > highScores[entryNum-1].getScore()){
            if (entryNum < highScores.length){
                entryNum++;
            }
            int y = entryNum - 1;
            while (y > 0 && entry.getScore() > highScores[y-1].getScore()){
                highScores[y] = highScores[y-1];
                y--;
            }
            highScores[y] = entry;
        }
    }

    //删除下表i的值
    public GameEntry remove(int i) throws IndexOutOfBoundsException{
        if (i < 0 || i > entryNum - 1){
            throw new IndexOutOfBoundsException("an invalid index " + i + " to remove.");
        }
        GameEntry tmp = highScores[i];
        for (int j = i; j < entryNum - 1; j++) {
            highScores[j] = highScores[j+1];
        }
        highScores[entryNum - 1] = null;
        entryNum--;
        return tmp;
    }


    //打印
    public void print(){
        for (int i = 0; i < entryNum; i++) {
            System.out.println(highScores[i]);
        }
    }
}
