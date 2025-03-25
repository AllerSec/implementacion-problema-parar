package com.haltingproblem.builders;

import com.haltingproblem.model.Program;

public interface ProgramBuilder<T extends Program> {
    ProgramBuilder<T> setInitialValue(int value);
    T build();
}