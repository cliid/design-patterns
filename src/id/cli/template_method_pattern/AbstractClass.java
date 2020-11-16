package id.cli.template_method_pattern;

public abstract class AbstractClass {
    public abstract String operation1();
    public abstract String operation2();
    public final String templateMethod() {
        return "Some template" + operation1() + operation2();
    }
}
