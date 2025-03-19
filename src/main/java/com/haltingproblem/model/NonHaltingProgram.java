package com.haltingproblem.model;

public class NonHaltingProgram extends Program {
    @Override
    public void run() {
        int num = initialValue;
        while (true) {
            System.out.println(num);
            num++;
        }
    }
}
