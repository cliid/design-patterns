package id.cli.abstract_factory_pattern.product.button;

import id.cli.abstract_factory_pattern.product.ProductButton;

public class ProductButtonLinux implements ProductButton {
    @Override
    public void press() {
        System.out.println("Linux Button Pressed!");
    }
}
