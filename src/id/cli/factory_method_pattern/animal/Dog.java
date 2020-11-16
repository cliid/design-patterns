package id.cli.factory_method_pattern.animal;

import id.cli.factory_method_pattern.Animal;

public class Dog implements Animal {
    @Override
    public void sayHello() {
        System.out.println("Me dog, Hello!");
    }
}
