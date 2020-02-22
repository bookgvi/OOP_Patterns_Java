package Observer;

public class ObserverClass implements Observer{

    @Override
    public void next(Subject self) {
        System.out.println(self);
    }
}
