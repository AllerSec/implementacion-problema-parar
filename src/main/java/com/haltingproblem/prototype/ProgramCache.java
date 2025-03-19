package com.haltingproblem.prototype;

import com.haltingproblem.model.HaltingProgram;
import com.haltingproblem.model.NonHaltingProgram;
import com.haltingproblem.model.Program;

import java.util.HashMap;
import java.util.Map;

public class ProgramCache {
    private static final Map<String, Program> programMap = new HashMap<>();

    public static void loadCache() {
        HaltingProgram haltingProgram = new HaltingProgram();
        haltingProgram.setInitialValue(3); // Valor predeterminado
        programMap.put("HaltingProgram", haltingProgram);

        NonHaltingProgram nonHaltingProgram = new NonHaltingProgram();
        nonHaltingProgram.setInitialValue(0); // Valor predeterminado
        programMap.put("NonHaltingProgram", nonHaltingProgram);
    }

    public static Program getProgram(String programType) {
        Program cachedProgram = programMap.get(programType);
        return (Program) cachedProgram.clone();
    }
}