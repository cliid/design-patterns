package id.cli.abstract_factory_pattern.factory;

import id.cli.abstract_factory_pattern.product.ProductAlert;
import id.cli.abstract_factory_pattern.product.ProductButton;

public interface ProductFactory {
    ProductAlert getProductAlert();
    ProductButton getProductButton();
}
