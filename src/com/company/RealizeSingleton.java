package com.company;

import Singleton.Singleton;

public class RealizeSingleton implements Realize {
    public static void exec() {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();
    }
}
