package id.cli.iterator_pattern.item;

import id.cli.iterator_pattern.Item;

public class MachineGun implements Item {
    @Override
    public String name() {
        return "Machine Gun";
    }

    @Override
    public void use() {
        System.out.println("Used Machine Gun");
    }
}
