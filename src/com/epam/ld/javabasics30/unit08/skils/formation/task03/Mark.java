package com.epam.ld.javabasics30.unit08.skils.formation.task03;

public enum Mark {
    EXCELLENT(5),
    GOOD(4),
    SATISFACTORILY(3),
    UNSATISFACTORILY(2),
    BAD(1);

    private final int value;

    private Mark(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
