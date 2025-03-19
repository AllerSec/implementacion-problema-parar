package com.haltingproblem.builders;

public interface ProgramBuilder {
    ProgramBuilder setInitialValue(int value);
    ProgramBuilder setHalting(boolean halting);
    Program build();
}
