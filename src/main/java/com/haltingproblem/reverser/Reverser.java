package com.haltingproblem.reverser;

import com.haltingproblem.haltchecker.HaltChecker;
import com.haltingproblem.model.Program;
import com.haltingproblem.prototype.ProgramPrototype;

public class Reverser extends Program {
    private Program program;

    public Reverser(Program program) {
        this.program = program;
    }

    @Override
    public void run() {
        if(HaltChecker.willHalt(program)) {
            // Entrar en bucle infinito
            while(true) {
                System.out.println("Looping...");
            }
        } else {
            System.out.println("Stopping immediately");
        }
    }

    @Override
    public ProgramPrototype clone() {
        return new Reverser((Program) program.clone());
    }
}
