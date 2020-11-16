package id.cli.observer_pattern.display;

import id.cli.observer_pattern.IObserver;
import id.cli.observer_pattern.WeatherStation;

public class WindowDisplay implements IObserver {
    private int currentTemperature;
    public WindowDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    WeatherStation weatherStation;

    @Override
    public void update() {
        currentTemperature = weatherStation.getTemperature();
    }

    public void display() {
        System.out.println("Phone Display: " + currentTemperature);
    }
}
