package com.johncross;

public class AnimalControllerImpl implements AnimalController {
    AnimalService service;

    public AnimalControllerImpl(AnimalService service) {
        this.service = service;
    }

    @Override
    public void talkToDogs() {
        service.makeDogsBark();
    }

    @Override
    public void addDog(Dog dog) {
        service.createDogList(dog);
    }

    @Override
    public void viewDogs() {
        AnimalView view = new AnimalViewImpl();
        view.viewDogs(service.getDogList());
    }
}
