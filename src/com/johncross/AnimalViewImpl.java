package com.johncross;

import java.util.List;

public class AnimalViewImpl implements AnimalView {

    @Override
    public void viewDogs(List<Dog> dogList) {
        for (Dog dog : dogList) {
            System.out.println("Name: " + dog.getName());
            System.out.println("Color: " + dog.getColor());
            System.out.println("Breed: " + dog.getBreed());
            System.out.println("Age: " + dog.getAge());

        }
    }
}
