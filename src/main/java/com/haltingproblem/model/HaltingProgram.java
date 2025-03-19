package com.haltingproblem.model;

import com.haltingproblem.prototype.ProgramPrototype;

public class HaltingProgram extends Program {
    @Override
    public void run() {
        int num = initialValue;
        while(num > 0) {
            System.out.println(num);
            num--;
        }
    }

    @Override
    public ProgramPrototype clone() {
        HaltingProgram clone = new HaltingProgram();
        clone.setInitialValue(this.initialValue);
        return clone;
    }
}
