package com.haltingproblem.reverser;

import com.haltingproblem.haltchecker.HaltChecker;
import com.haltingproblem.model.Program;

public class Reverser extends Program {
    private Program program;

    public Reverser(Program program) {
        this.program = program;
    }

    @Override
    public void runProgram() {
        if (HaltChecker.willHalt(program)) {
            while (true) {
                System.out.println("Reverser entra en bucle...");
            }
        } else {
            System.out.println("Reverser se detiene inmediatamente.");
        }
    }
}
