package id.cli.adapter_pattern;

// Adapter pattern is also known as a "Wrapper"

public class Main {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        ITarget target = new Adapter(adaptee);
        target.request();
    }
}
