package id.cli.singleton_pattern;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton newSingleton = Singleton.getInstance();
    }
}
