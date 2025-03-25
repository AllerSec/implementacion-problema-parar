package com.haltingproblem.haltchecker;

import com.haltingproblem.model.HaltingProgram;
import com.haltingproblem.model.NonHaltingProgram;
import com.haltingproblem.model.Program;

public class HaltChecker {
    public static boolean willHalt(Program program) {
        if (program instanceof HaltingProgram) {
            return checkHaltingProgram((HaltingProgram) program);
        } else {
            return checkNonHaltingProgram((NonHaltingProgram) program);
        }
    }

    private static boolean checkHaltingProgram(HaltingProgram program) {
        int initialValue = program.getInitialValue();
        int previousValue = initialValue;

        for (int i = 0; i < 5; i++) { // Reducir el número de iteraciones
            program.runProgram();
            int currentValue = program.getCurrentValue();

            if (currentValue < previousValue) {
                return true; // El programa se detendrá si el valor decrece
            }

            previousValue = currentValue;
        }

        return false; // El programa no se detendrá si el valor no decrece
    }

    private static boolean checkNonHaltingProgram(NonHaltingProgram program) {
        int initialValue = program.getInitialValue();

        for (int i = 0; i < 5; i++) { // Reducir el número de iteraciones
            program.runProgram();
            int currentValue = program.getCurrentValue();

            if (currentValue > initialValue) {
                return false; // NonHaltingProgram no se detendrá si el valor incrementa
            }
        }

        return true; // NonHaltingProgram se detendrá si el valor no incrementa
    }
}