package id.cli.factory_method_pattern.factory;

import id.cli.factory_method_pattern.Animal;
import id.cli.factory_method_pattern.AnimalFactory;
import id.cli.factory_method_pattern.animal.Cat;
import id.cli.factory_method_pattern.animal.Dog;
import id.cli.factory_method_pattern.animal.Duck;

public class BalancedAnimalFactory implements AnimalFactory {
    private int catCounter, dogCounter, duckCounter = 0;
    @Override
    public Animal createAnimal() { // Some balanced animal generation
        int randomNumber = (int) (Math.random() * 3);
        if (duckCounter != 0 && catCounter != 0 && dogCounter != 0) {
            duckCounter = 0;
            catCounter = 0;
            dogCounter = 0;
        }
        if (randomNumber == 0) { // Duck
            duckCounter++;
            return new Duck();
        } else if (randomNumber == 1) { // Cat
            catCounter++;
            return new Cat();
        } else if (randomNumber == 2) { // Dog
            dogCounter++;
            return new Dog();
        }
        return null;
    }
}
