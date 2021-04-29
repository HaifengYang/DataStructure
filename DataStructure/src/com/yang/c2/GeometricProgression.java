package com.yang.c2;

public class GeometricProgression extends AbstractProgression{
    private final int base;

    public GeometricProgression() {

        this(1,1);
    }

    public GeometricProgression(int base) {
        this(base, 1);
    }

    public GeometricProgression(int base, long start) {
        super(start);
        this.base = base;
    }

    @Override
    protected void advance() {
        this.current *= base;
    }
}
