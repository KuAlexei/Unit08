package com.epam.ld.javabasics30.unit08.skils.formation.task03;

public enum Discipline {
    LITERATURE("Литература"),
    MATHEMATICS("Математика"),
    HISTORY("История");

    private final String name;

    private Discipline(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
