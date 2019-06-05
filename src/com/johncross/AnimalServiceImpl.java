package com.johncross;

import java.util.List;

public class AnimalServiceImpl implements AnimalService {

    AnimalRepository repository;

    public AnimalServiceImpl(AnimalRepository repository) {
        this.repository = repository;
    }

    @Override
    public void createDogList(Dog dog) {
        repository.storeAnimal(dog);
    }

    @Override
    public void makeDogsBark() {
        for (Dog animal : repository.getAnimalList()) {
            System.out.println(animal.getName() + " barks.");
        }
    }

    @Override
    public List<Dog> getDogList() {
        return repository.getAnimalList();
    }

}
