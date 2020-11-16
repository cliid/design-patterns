package id.cli.abstract_factory_pattern.factory;

import id.cli.abstract_factory_pattern.product.ProductAlert;
import id.cli.abstract_factory_pattern.product.ProductButton;
import id.cli.abstract_factory_pattern.product.alert.ProductAlertWindows;
import id.cli.abstract_factory_pattern.product.button.ProductButtonWindows;

public class WindowsProductFactory implements ProductFactory{
    @Override
    public ProductAlert getProductAlert() {
        return new ProductAlertWindows();
    }

    @Override
    public ProductButton getProductButton() {
        return new ProductButtonWindows();
    }
}
