package com.haltingproblem.model;

public class NonHaltingProgram extends Program {
    @Override
    public void runProgram() {
        while (true) {
            System.out.println(currentValue);
            currentValue++;
        }
    }
}