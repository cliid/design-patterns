package id.cli.iterator_pattern.item;

import id.cli.iterator_pattern.Item;

public class Bow implements Item {
    @Override
    public String name() {
        return "Bow";
    }

    @Override
    public void use() {
        System.out.println("Used Bow");
    }
}
