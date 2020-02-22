package Observer;

public interface Subject {
    void subscribe(ObserverClass observer);
    void unsubscribe();
    void publish();
}
