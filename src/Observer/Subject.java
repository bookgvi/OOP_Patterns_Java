package Observer;

public interface Subject {
    void addSubscriber(Observer observer);
    void deleteSubscriber();
    void publish();
}
