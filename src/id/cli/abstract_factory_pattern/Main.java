package id.cli.abstract_factory_pattern;

import id.cli.abstract_factory_pattern.factory.ProductFactory;
import id.cli.abstract_factory_pattern.factory.WindowsProductFactory;
import id.cli.abstract_factory_pattern.product.ProductAlert;
import id.cli.abstract_factory_pattern.product.ProductButton;

public class Main {
    public static void main(String[] args) {
        ProductFactory productFactory = new WindowsProductFactory();
        ProductAlert productAlert = productFactory.getProductAlert();
        ProductButton productButton = productFactory.getProductButton();
        productAlert.alert();
        productAlert.modelName();
        productButton.press();
    }
}
