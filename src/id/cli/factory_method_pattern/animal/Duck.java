package id.cli.factory_method_pattern.animal;

import id.cli.factory_method_pattern.Animal;

public class Duck implements Animal {
    @Override
    public void sayHello() {
        System.out.println("Me duck, Hello!");
    }
}
