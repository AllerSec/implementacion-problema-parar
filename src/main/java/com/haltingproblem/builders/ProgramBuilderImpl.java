package com.haltingproblem.builders;

import com.haltingproblem.model.HaltingProgram;
import com.haltingproblem.model.NonHaltingProgram;
import com.haltingproblem.model.Program;

public class ProgramBuilderImpl implements ProgramBuilder {
    private int initialValue;
    private boolean isHalting;

    @Override
    public ProgramBuilder setInitialValue(int value) {
        this.initialValue = value;
        return this;
    }

    @Override
    public ProgramBuilder setHalting(boolean halting) {
        this.isHalting = halting;
        return this;
    }

    @Override
    public Program build() {
        if (isHalting) {
            HaltingProgram program = new HaltingProgram();
            program.setInitialValue(initialValue);
            return program;
        } else {
            NonHaltingProgram program = new NonHaltingProgram();
            program.setInitialValue(initialValue);
            return program;
        }
    }
}
