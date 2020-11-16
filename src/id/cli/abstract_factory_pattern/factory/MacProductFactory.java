package id.cli.abstract_factory_pattern.factory;

import id.cli.abstract_factory_pattern.product.ProductAlert;
import id.cli.abstract_factory_pattern.product.ProductButton;
import id.cli.abstract_factory_pattern.product.alert.ProductAlertMac;
import id.cli.abstract_factory_pattern.product.button.ProductButtonMac;

public class MacProductFactory implements ProductFactory{
    @Override
    public ProductAlert getProductAlert() {
        return new ProductAlertMac();
    }

    @Override
    public ProductButton getProductButton() {
        return new ProductButtonMac();
    }
}
