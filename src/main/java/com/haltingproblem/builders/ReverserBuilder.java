package com.haltingproblem.builders;

import com.haltingproblem.model.Program;
import com.haltingproblem.reverser.Reverser;

public class ReverserBuilder implements ProgramBuilder<Reverser> {
    private int initialValue;
    private ProgramBuilder<? extends Program> innerBuilder;

    @Override
    public ReverserBuilder setInitialValue(int value) {
        this.initialValue = value;
        return this;
    }

    // Método para establecer el builder del programa interno a invertir
    public ReverserBuilder setInnerBuilder(ProgramBuilder<? extends Program> builder) {
        this.innerBuilder = builder;
        return this;
    }

    @Override
    public Reverser build() {
        if (innerBuilder == null) {
            throw new IllegalStateException("Se debe proporcionar un builder para el programa interno.");
        }
        // Configuramos el builder interno con el valor inicial
        innerBuilder.setInitialValue(initialValue);
        Program innerProgram = innerBuilder.build();

        // Creamos la instancia de Reverser y le asignamos el programa interno
        Reverser reverser = new Reverser();
        reverser.setInitialValue(initialValue); // Se mantiene el valor inicial en la herencia de Program
        reverser.setInnerProgram(innerProgram);
        return reverser;
    }
}

