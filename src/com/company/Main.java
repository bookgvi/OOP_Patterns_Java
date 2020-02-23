package com.company;

import DI.MergeSort;
import Utils.SpeedTest;

public class Main {

    public static void main(String[] args) {
        final int ARRAY_LENGTH = 5000000;
        final int TEST_COUNT = 1;

        RealizeDI.exec(ARRAY_LENGTH);
        RealizeObserver.exec();
        RealizeSingleton.exec();
        RealizeFactory.exec(ARRAY_LENGTH, TEST_COUNT);
    }
}
