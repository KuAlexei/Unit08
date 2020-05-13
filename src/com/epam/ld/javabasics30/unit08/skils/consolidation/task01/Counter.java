package com.epam.ld.javabasics30.unit08.skils.consolidation.task01;

public class Counter {

    private int counter;
    private final int min;
    private final int max;
    public Counter(int min, int max) {
        this(min, max, 0);
    }

    public Counter(int min, int max, int initialValue) {
        this.min = min;
        this.max = max;
        this.counter = initialValue;
    }

    public void inc() {
        if (counter < max) {
            counter++;
        }
    }

    public void dec() {
        if (counter > min) {
            counter--;
        }
    }

    public int getState() {
        return counter;
    }

}

