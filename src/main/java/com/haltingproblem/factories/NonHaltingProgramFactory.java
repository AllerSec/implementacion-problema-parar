package com.haltingproblem.factories;

import com.haltingproblem.model.NonHaltingProgram;
import com.haltingproblem.model.Program;

public class NonHaltingProgramFactory implements ProgramFactory {
    @Override
    public Program createProgram(int initialValue) {
        NonHaltingProgram program = new NonHaltingProgram();
        program.setInitialValue(initialValue);
        return program;
    }
}