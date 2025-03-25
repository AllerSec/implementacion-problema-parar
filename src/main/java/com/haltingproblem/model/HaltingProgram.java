package com.haltingproblem.model;

public class HaltingProgram extends Program {
    @Override
    public void runProgram() {
        while (currentValue > 0) {
            System.out.println(currentValue);
            currentValue--;
        }
    }
}
