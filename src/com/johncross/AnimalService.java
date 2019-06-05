package com.johncross;

import java.util.List;

public interface AnimalService {

    void createDogList(Dog dog);
    void makeDogsBark();
    List<Dog> getDogList();

}
