package id.cli.template_method_pattern;

import id.cli.template_method_pattern.concrete.ConcreteClass1;

public class Main {
    public static void main(String[] args) {
        AbstractClass thing = new ConcreteClass1();
        System.out.println(thing.templateMethod());
    }
}
