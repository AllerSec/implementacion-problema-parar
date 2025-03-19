package com.haltingproblem.model;

public abstract class Program {
    protected int initialValue;

    public void setInitialValue(int value) {
        this.initialValue = value;
    }

    public abstract void run();
}
