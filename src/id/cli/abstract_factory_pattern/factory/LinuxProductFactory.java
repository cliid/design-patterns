package id.cli.abstract_factory_pattern.factory;

import id.cli.abstract_factory_pattern.product.ProductAlert;
import id.cli.abstract_factory_pattern.product.ProductButton;
import id.cli.abstract_factory_pattern.product.alert.ProductAlertLinux;
import id.cli.abstract_factory_pattern.product.button.ProductButtonLinux;

public class LinuxProductFactory implements ProductFactory{
    @Override
    public ProductAlert getProductAlert() {
        return new ProductAlertLinux();
    }

    @Override
    public ProductButton getProductButton() {
        return new ProductButtonLinux();
    }
}
