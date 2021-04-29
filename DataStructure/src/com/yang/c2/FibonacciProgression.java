package com.yang.c2;

public class FibonacciProgression extends AbstractProgression{
    private long prev;

    public FibonacciProgression() {
        this(1);
    }

    public FibonacciProgression(long prev) {
        this(0, prev);
    }

    public FibonacciProgression(long first, long second) {
        super(first);
        prev = second - first;
    }

    @Override
    protected void advance() {
       long tmp = current;
       current += prev;
       prev = tmp;
    }
}
