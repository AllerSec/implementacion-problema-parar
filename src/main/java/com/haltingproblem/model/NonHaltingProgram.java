package com.haltingproblem.model;

import com.haltingproblem.prototype.ProgramPrototype;

public class NonHaltingProgram extends Program {
    @Override
    public void runProgram() {
        while(true) {
            System.out.println(currentValue);
            currentValue++;
        }
    }

    @Override
    public ProgramPrototype clone() {
        NonHaltingProgram clone = new NonHaltingProgram();
        clone.setInitialValue(this.initialValue);
        return clone;
    }
}
