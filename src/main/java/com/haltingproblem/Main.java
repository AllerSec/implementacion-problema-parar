package com.haltingproblem;

import com.haltingproblem.builders.HaltingProgramBuilder;
import com.haltingproblem.builders.NonHaltingProgramBuilder;
import com.haltingproblem.model.Program;
import com.haltingproblem.reverser.Reverser;

public class Main {
    public static void main(String[] args) {
        // Construir un programa que SÍ termina
        Program haltingProgram = new HaltingProgramBuilder()
            .setInitialValue(3)
            .build();

        // Construir un programa que NO termina
        Program nonHaltingProgram = new NonHaltingProgramBuilder()
            .setInitialValue(0)
            .build();

        // Simular el Problema de la Parada
        System.out.println("=== Simulación con Builder ===");
        Reverser reverser1 = new Reverser(haltingProgram);
        Reverser reverser2 = new Reverser(nonHaltingProgram);

        reverser2.runProgram();
        reverser1.runProgram();
    }
}