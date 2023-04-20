package org.example;

public class Gato extends Animal{

    public void miar(){
        System.out.println("MIAU!");
    }

    public void correr(){
        System.out.println("ESTOU CORRNEDO A 500KM/H!");
    }

    @Override
    public String toString() {
        return "Gato";
    }
}
