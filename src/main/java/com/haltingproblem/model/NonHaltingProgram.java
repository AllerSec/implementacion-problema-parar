package com.haltingproblem.model;

public class NonHaltingProgram extends Program {
    @Override
    public void runProgram() {
        int num = initialValue;
        while (true) {
            System.out.println(num);
            num++;
        }
    }
}
