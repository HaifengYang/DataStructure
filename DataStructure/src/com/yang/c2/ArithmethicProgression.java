package com.yang.c2;

public class ArithmethicProgression extends AbstractProgression{
    private final int stepSize;

    public ArithmethicProgression() {
        this(1,0);
    }

    public ArithmethicProgression(int stepSize) {
        this(stepSize,0);
    }

    public ArithmethicProgression(int stepSize, long start) {
        super(start);
        this.stepSize = stepSize;
    }

    @Override
    protected void advance() {
        current += stepSize;
    }
}
