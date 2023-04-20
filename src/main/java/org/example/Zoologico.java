package org.example;

public class Zoologico {

    public void inserirAnimal(Animal animal, Animal outroAnimal) {
        System.out.println("INSERINDO ANIMAL");
        leaoSeAlimentandoDoGato(animal, outroAnimal);
    }

    private void leaoSeAlimentandoDoGato (Animal animal, Animal outroAnimal) {
        if (validadorDeAnimal(animal, "Leao")) {
            animal.rugir(outroAnimal);
            gatoOuCachorro(animal, outroAnimal);
        } else if (validadorDeAnimal( outroAnimal, "Leao")) {
            outroAnimal.rugir(animal);
            gatoOuCachorro(outroAnimal, animal);
        }
    }

    private void gatoOuCachorro (Animal animal, Animal outroAnimal){
        if (validadorDeAnimal(outroAnimal, "Gato")) {
            animal.cacar(outroAnimal);
        } else if (validadorDeAnimal(outroAnimal,"Cachorro")){
            animal.fugir(outroAnimal);
        }
    }

    private boolean validadorDeAnimal (Animal animal, String nome){
        if (animal.toString().equalsIgnoreCase(nome)){
            return true;
        }
        return false;
    }
}
