package com.haltingproblem.builders;

import com.haltingproblem.model.Program;

public interface ProgramBuilder {
    ProgramBuilder setInitialValue(int value);
    ProgramBuilder setHalting(boolean halting);
    Program build();
}
