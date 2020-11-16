package id.cli.observer_pattern;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class WeatherStation implements IObservable {
    List<IObserver> observerList = new ArrayList<>();
    @Override
    public void add(IObserver iObserver) {
        observerList.add(iObserver);
    }

    @Override
    public void remove(IObserver iObserver) {
        observerList.remove(iObserver);
    }

    @Override
    public void alert() {
        for (IObserver iObserver : observerList) {
            iObserver.update();
        }
    }

    public int getTemperature() {
        return (int) (Math.random() * 10);
    }
}
