package Observer;

public class SubjectClass implements Subject {
    private final int MAX_SUBSCRIBERS = 10;
    private int subscribersCount = 0;
    private ObserverClass[] subscribers = new ObserverClass[MAX_SUBSCRIBERS];
    public int NEW_INFO = 10;

    @Override
    public void subscribe(ObserverClass observer) {
        if (subscribersCount < MAX_SUBSCRIBERS - 1) {
            subscribers[subscribersCount++] = observer;
        } else {
            System.out.println("Sorry, too much...");
        }
    }

    public void unsubscribe() {
        if (subscribersCount > 0) {
            subscribersCount--;
        }
    }

    public void publish() {
        for (int i = 0; i < subscribersCount; i++) {
            subscribers[i].next(this);
        }
    }
}
