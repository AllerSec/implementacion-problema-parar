package com.haltingproblem;

import com.haltingproblem.builders.ProgramBuilderImpl;
import com.haltingproblem.model.Program;
import com.haltingproblem.reverser.Reverser;

public class Main {
    public static void main(String[] args) {
        ProgramBuilderImpl builder = new ProgramBuilderImpl();

        // Construir un programa que SÍ termina
        Program haltingProgram = builder
            .setInitialValue(3)
            .setHalting(true)
            .build();

        // Construir un programa que NO termina
        Program nonHaltingProgram = builder
            .setInitialValue(0)
            .setHalting(false)
            .build();

        // Simular el Problema de la Parada
        System.out.println("=== Simulación con Builder ===");
        Reverser reverser1 = new Reverser(haltingProgram);
        Reverser reverser2 = new Reverser(nonHaltingProgram);

        reverser2.runProgram();
        reverser1.runProgram();
    }
}