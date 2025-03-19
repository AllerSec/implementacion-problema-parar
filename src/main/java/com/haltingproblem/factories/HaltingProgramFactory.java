package com.haltingproblem.factories;

import com.haltingproblem.model.HaltingProgram;
import com.haltingproblem.model.Program;

public class HaltingProgramFactory implements ProgramFactory {
    @Override
    public Program createProgram(int initialValue) {
        HaltingProgram program = new HaltingProgram();
        program.setInitialValue(initialValue);
        return program;
    }
}