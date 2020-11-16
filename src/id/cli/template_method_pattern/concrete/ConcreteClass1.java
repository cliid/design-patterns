package id.cli.template_method_pattern.concrete;

import id.cli.template_method_pattern.AbstractClass;

public class ConcreteClass1 extends AbstractClass {
    @Override
    public String operation1() {
        return "Hello";
    }

    @Override
    public String operation2() {
        return "World";
    }
}
