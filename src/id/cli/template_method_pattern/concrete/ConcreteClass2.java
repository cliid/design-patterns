package id.cli.template_method_pattern.concrete;

import id.cli.template_method_pattern.AbstractClass;

public class ConcreteClass2 extends AbstractClass {
    @Override
    public String operation1() {
        return "I love";
    }

    @Override
    public String operation2() {
        return "You";
    }
}
