package com.company;

import Observer.ObserverClass;
import Observer.SubjectClass;

public class RealizeObserver implements Realize {
    public static void exec() {
        SubjectClass subject = new SubjectClass();
        ObserverClass observer = new ObserverClass();

        subject.subscribe(observer);
        subject.subscribe(new ObserverClass());
        subject.publish();
    }
}
