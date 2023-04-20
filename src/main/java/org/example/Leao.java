package org.example;

public class Leao extends Animal{
    public void rugir(Animal animal) {
        System.out.println("RUWURWUURWURUW em direção ao "+ animal);
    }

    public void cacar(Animal alimento) {
        System.out.println(this.toString() + " se alimentou do " + alimento);
    }

    public void fugir(Animal animal) {
        System.out.println(this.toString() + " Arregou!");
    }

    @Override
    public String toString() {
        return "Leao";
    }
}
