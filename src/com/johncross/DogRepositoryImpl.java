package com.johncross;

import java.util.ArrayList;
import java.util.List;

public class DogRepositoryImpl implements AnimalRepository {
    private List<Dog> getDogList() {
        return dogList;
    }

    List<Dog> dogList = new ArrayList<>();

    @Override
    public void storeAnimal(Dog dog) {
        dogList.add(dog);
    }

    @Override
    public List<Dog> getAnimalList() {
        return getDogList();
    }
}
