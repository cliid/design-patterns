package id.cli.observer_pattern;

public interface IObservable {
    void add(IObserver iObserver);
    void remove(IObserver iObserver);
    void alert(); // notify
}
