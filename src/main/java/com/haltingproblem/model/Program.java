// Archivo: Program.java
package com.haltingproblem.model;

import com.haltingproblem.prototype.ProgramPrototype;

public abstract class Program implements ProgramPrototype {
    protected int initialValue;
    protected int currentValue;
    public void setInitialValue(int value) {
        this.initialValue = value;
        this.currentValue = value;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public int getInitialValue() {
        return initialValue;
    }

    public abstract void runProgram();

    @Override
    public ProgramPrototype clone() {
        try {
            return (ProgramPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("El clonaje falló", e);
        }
    }
}