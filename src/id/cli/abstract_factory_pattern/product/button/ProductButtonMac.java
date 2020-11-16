package id.cli.abstract_factory_pattern.product.button;

import id.cli.abstract_factory_pattern.product.ProductButton;

public class ProductButtonMac implements ProductButton {
    @Override
    public void press() {
        System.out.println("macOS Button Pressed!");
    }
}
