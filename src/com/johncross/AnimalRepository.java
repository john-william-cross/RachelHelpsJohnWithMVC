package com.johncross;

import java.util.List;

public interface AnimalRepository {

    void storeAnimal(Dog animal);
    List<Dog> getAnimalList();

}

/*
every repository should have its own controller, service, and view
 */