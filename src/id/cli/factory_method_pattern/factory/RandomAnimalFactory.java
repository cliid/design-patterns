package id.cli.factory_method_pattern.factory;

import id.cli.factory_method_pattern.Animal;
import id.cli.factory_method_pattern.AnimalFactory;
import id.cli.factory_method_pattern.animal.Cat;
import id.cli.factory_method_pattern.animal.Dog;
import id.cli.factory_method_pattern.animal.Duck;

import java.util.Random;

public class RandomAnimalFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        switch ((int) (Math.random() * 3)) {
            case 0:
                return new Cat();
            case 1:
                return new Dog();
            case 2:
                return new Duck();
        }
        return null;
    }
}
