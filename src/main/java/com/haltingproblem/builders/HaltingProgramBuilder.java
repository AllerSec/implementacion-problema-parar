package com.haltingproblem.builders;

import com.haltingproblem.model.HaltingProgram;

public class HaltingProgramBuilder implements ProgramBuilder<HaltingProgram> {
    private int initialValue;

    @Override
    public HaltingProgramBuilder setInitialValue(int value) {
        this.initialValue = value;
        return this;
    }

    @Override
    public HaltingProgram build() {
        HaltingProgram program = new HaltingProgram();
        program.setInitialValue(initialValue);
        return program;
    }
}