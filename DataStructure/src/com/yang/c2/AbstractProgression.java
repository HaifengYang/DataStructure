package com.yang.c2;

public abstract class AbstractProgression {
    protected long current;

    public AbstractProgression() {
        this(0);
    }

    public AbstractProgression(long start){
        this.current = start;
    }

    public long nextValue()
    {
        long answer = this.current;
        advance();
        return answer;
    }

    public void printProgression(int n)
    {
        System.out.print(nextValue());
        for (int i = 1; i < n; i++) {
            System.out.print(" " + nextValue());
        }
    }

    protected abstract void advance();

}
