package com.haltingproblem;

import com.haltingproblem.model.HaltingProgram;
import com.haltingproblem.model.NonHaltingProgram;
import com.haltingproblem.model.Program;
import com.haltingproblem.reverser.Reverser;

public class Main {
    public static void main(String[] args) {
        // Crear prototipos originales
        HaltingProgram haltingPrototype = new HaltingProgram();
        haltingPrototype.setInitialValue(3);

        NonHaltingProgram nonHaltingPrototype = new NonHaltingProgram();
        nonHaltingPrototype.setInitialValue(0);

        // Clonar prototipos
        Program haltingClone = (Program) haltingPrototype.clone();
        Program nonHaltingClone = (Program) nonHaltingPrototype.clone();

        // Simular el Problema de la Parada
        System.out.println("=== Simulación con Prototype ===");
        Reverser reverser1 = new Reverser(haltingClone);
        Reverser reverser2 = new Reverser(nonHaltingClone);

        System.out.println("Probando clon de HaltingProgram:");
        reverser1.run(); // Bucle infinito

        System.out.println("\nProbando clon de NonHaltingProgram:");
        reverser2.run(); // Se detiene
    }
}