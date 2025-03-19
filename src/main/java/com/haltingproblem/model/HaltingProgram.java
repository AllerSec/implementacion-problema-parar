package com.haltingproblem.model;

public class HaltingProgram extends Program {
    @Override
    public void run() {
        int num = initialValue;
        while (num > 0) {
            System.out.println(num);
            num--;
        }
    }
}
