package com.haltingproblem.haltchecker;

import com.haltingproblem.model.Program;

public class HaltChecker {
    public static boolean willHalt(Program program) {
        // Simulación: Si es HaltingProgram, retorna true
        return program instanceof HaltingProgram;
    }
}
