package com.haltingproblem.factories;

import com.haltingproblem.model.Program;

public interface ProgramFactory {
    Program createProgram(int initialValue);
}