package com.haltingproblem.builders;

import com.haltingproblem.model.NonHaltingProgram;

public class NonHaltingProgramBuilder implements ProgramBuilder<NonHaltingProgram> {
    private int initialValue;

    @Override
    public NonHaltingProgramBuilder setInitialValue(int value) {
        this.initialValue = value;
        return this;
    }

    @Override
    public NonHaltingProgram build() {
        NonHaltingProgram program = new NonHaltingProgram();
        program.setInitialValue(initialValue);
        return program;
    }
}