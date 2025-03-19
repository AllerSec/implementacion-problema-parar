package com.haltingproblem;

import com.haltingproblem.factories.HaltingProgramFactory;
import com.haltingproblem.factories.NonHaltingProgramFactory;
import com.haltingproblem.factories.ProgramFactory;
import com.haltingproblem.model.Program;
import com.haltingproblem.reverser.Reverser;

public class Main {
    public static void main(String[] args) {
        // Crear fábricas
        ProgramFactory haltingFactory = new HaltingProgramFactory();
        ProgramFactory nonHaltingFactory = new NonHaltingProgramFactory();

        // Crear programas usando las fábricas
        Program haltingProgram = haltingFactory.createProgram(3);
        Program nonHaltingProgram = nonHaltingFactory.createProgram(0);

        // Simular el Problema de la Parada
        System.out.println("=== Simulación con Abstract Factory ===");
        Reverser reverser1 = new Reverser(haltingProgram);
        Reverser reverser2 = new Reverser(nonHaltingProgram);

        System.out.println("Probando Reverser con HaltingProgram:");
        reverser1.run();

        System.out.println("\nProbando Reverser con NonHaltingProgram:");
        reverser2.run();
    }
}