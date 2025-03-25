package com.haltingproblem.model;

public abstract class Program {
    protected int initialValue;
    protected int currentValue;

    public void setInitialValue(int value) {
        this.initialValue = value;
        this.currentValue = value;
    }

    public int getInitialValue() {
        return initialValue;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public abstract void runProgram();
}