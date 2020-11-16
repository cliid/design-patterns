package id.cli.factory_method_pattern;

import id.cli.factory_method_pattern.factory.BalancedAnimalFactory;
import id.cli.factory_method_pattern.factory.RandomAnimalFactory;

public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new RandomAnimalFactory();
        for (int i = 0; i < 17; i++) {
            Animal animal = animalFactory.createAnimal();
            animal.sayHello();
        }
    }
}
