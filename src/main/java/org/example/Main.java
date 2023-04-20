package org.example;

public class Main {
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico();

        Animal dog = new Cachorro();
        Animal cat = new Gato();
        Animal leao = new Leao();

        zoo.inserirAnimal(leao, dog);
    }
}

// Alimentar
// Skill principal
// Rosnar
// Fugir

// Zoo