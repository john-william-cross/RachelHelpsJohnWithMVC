package com.johncross;

public class Runner {

    public static void main(String[] args) {

        /*
        in runner, always instantiate repository, instantiate service that takes in the new repository,
        instantiate a controller that takes in the service
         */

        AnimalRepository repository = new DogRepositoryImpl();
        AnimalService service = new AnimalServiceImpl(repository);
        AnimalController controller = new AnimalControllerImpl(service);

        Dog runnerDog = new Dog("polka-dot", "unicorn", "Cornelious", 806849);


        /*
        ideally you're only calling methods from your controller in the runner. all the logic in the controllers should be service method calls
         */
        controller.addDog(runnerDog);
        controller.talkToDogs();
        controller.viewDogs();

    }

}
