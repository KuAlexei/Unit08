package com.epam.ld.javabasics30.unit08.skils.formation.task01;

public class Test1 {

    private int variableOne = 0;
    private int variableTwo = 0;

    public int getVariableOne() {
        return this.variableOne;
    }

    public void printVariableOne() {
        System.out.printf("VariableOne is %d", this.variableOne);
    }

    public void setVariableOne(int variableOne) {
        this.variableOne = variableOne;
    }

    public int getVariableTwo() {
        return this.variableTwo;
    }

    public void printVariableTwo() {
        System.out.printf("VariableTwo is %d", this.variableTwo);
    }

    public void setVariableTwo(int variableTwo) {
        this.variableTwo = variableTwo;
    }

    public int sum() {
        return this.variableOne + this.variableTwo;
    }

    public int max() {
        return Math.max(this.variableOne, this.variableTwo);
    }
}
