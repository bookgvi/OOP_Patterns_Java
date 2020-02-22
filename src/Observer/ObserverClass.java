package Observer;

public class ObserverClass implements Observer {
    public String test = "This is the test string!!!";

    @Override
    public void next(SubjectClass self) {
        System.out.println(self.NEW_INFO);
    }
}
