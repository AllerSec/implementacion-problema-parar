package com.haltingproblem.model;

import com.haltingproblem.prototype.ProgramPrototype;

public class HaltingProgram extends Program {
    @Override
    public void runProgram() {
        while(currentValue > 0) {
            System.out.println(currentValue);
            currentValue--;
        }
    }

    @Override
    public ProgramPrototype clone() {
        HaltingProgram clone = new HaltingProgram();
        clone.setInitialValue(this.initialValue);
        return clone;
    }
}
