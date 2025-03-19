package com.haltingproblem.model;

import com.haltingproblem.prototype.ProgramPrototype;

public class NonHaltingProgram extends Program {
    @Override
    public void run() {
        int num = initialValue;
        while(true) {
            System.out.println(num);
            num++;
        }
    }

    @Override
    public ProgramPrototype clone() {
        NonHaltingProgram clone = new NonHaltingProgram();
        clone.setInitialValue(this.initialValue);
        return clone;
    }
}
