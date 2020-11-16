package id.cli.iterator_pattern.item;

import id.cli.iterator_pattern.Item;

public class Sword implements Item {
    @Override
    public String name() {
        return "Sword";
    }

    @Override
    public void use() {
        System.out.println("Used Sword");
    }
}
