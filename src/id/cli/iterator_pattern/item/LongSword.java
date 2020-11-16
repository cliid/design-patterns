package id.cli.iterator_pattern.item;

import id.cli.iterator_pattern.Item;

public class LongSword implements Item {
    @Override
    public String name() {
        return "Long Sword";
    }

    @Override
    public void use() {
        System.out.println("Used Long Sword");
    }
}
