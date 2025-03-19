// Archivo: Program.java
package com.haltingproblem.model;

import com.haltingproblem.prototype.ProgramPrototype;

public abstract class Program implements ProgramPrototype {
    protected int initialValue;

    public void setInitialValue(int value) {
        this.initialValue = value;
    }

    public abstract void run();

    @Override
    public ProgramPrototype clone() {
        try {
            return (ProgramPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("El clonaje falló", e);
        }
    }
}