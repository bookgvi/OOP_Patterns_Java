package Singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance != null) {
            System.out.println("There is an instance!!!");
            return instance;
        }
        instance = new Singleton();
        return instance;
    }
}
