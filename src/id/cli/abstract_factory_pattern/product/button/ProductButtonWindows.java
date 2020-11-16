package id.cli.abstract_factory_pattern.product.button;

import id.cli.abstract_factory_pattern.product.ProductButton;

public class ProductButtonWindows implements ProductButton {
    @Override
    public void press() {
        System.out.println("Windows Button Pressed!");
    }
}
