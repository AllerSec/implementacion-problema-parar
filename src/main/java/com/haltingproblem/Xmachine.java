package com.haltingproblem;

import com.haltingproblem.builders.HaltingProgramBuilder;
import com.haltingproblem.builders.NonHaltingProgramBuilder;
import com.haltingproblem.haltchecker.HaltChecker;
import com.haltingproblem.model.Program;
import com.haltingproblem.reverser.Reverser;

public class Xmachine {
    public void run(boolean createHaltingProgram) {
        Program program;

        if (createHaltingProgram) {
            program = new HaltingProgramBuilder().setInitialValue(3).build();
        } else {
            program = new NonHaltingProgramBuilder().setInitialValue(0).build();
        }

        boolean willHalt = HaltChecker.willHalt(program);
        System.out.println("=== Verificación de HaltChecker ===");
        System.out.println("El programa se detendrá: " + willHalt);

        System.out.println("=== Simulación con Reverser ===");
        Reverser reverser = new Reverser(program);
        reverser.runProgram();
    }
}