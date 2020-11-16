package id.cli.abstract_factory_pattern.product.alert;

import id.cli.abstract_factory_pattern.product.ProductAlert;

public class ProductAlertWindows implements ProductAlert {
    @Override
    public void modelName() {
        System.out.println("Model Name: Windows");
    }

    @Override
    public void alert() {
        System.out.println("Windows Alerting!!!");
    }
}
