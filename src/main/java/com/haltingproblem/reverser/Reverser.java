package com.haltingproblem.reverser;

import com.haltingproblem.haltchecker.HaltChecker;
import com.haltingproblem.model.Program;

public class Reverser extends Program {
    private Program program;

    // Constructor sin parámetros
    public Reverser() {
    }

    // Setter para asignar el programa interno
    public void setInnerProgram(Program program) {
        this.program = program;
    }

    @Override
    public void runProgram() {
        if (program == null) {
            throw new IllegalStateException("No se ha establecido el programa interno.");
        }
        if (HaltChecker.willHalt(program)) {
            while (true) {
                System.out.println("Reverser entra en bucle...");
            }
        } else {
            System.out.println("Reverser se detiene inmediatamente.");
        }
    }
}