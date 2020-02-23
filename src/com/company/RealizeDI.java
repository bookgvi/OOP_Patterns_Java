package com.company;

import DI.MergeSort;
import Utils.ArrayCreate;
import Utils.SpeedTest;

public class RealizeDI implements Realize {
    public static void exec(int ARRAY_LENGTH) {
        final int TESTS_COUNT = 1;
        int[] arr = ArrayCreate.UnsortedArray(ARRAY_LENGTH);
        MergeSort ms = new MergeSort(arr);
        SpeedTest<int[]> speedTest = new SpeedTest<>(TESTS_COUNT);
        double result = speedTest.exec(ms);
        System.out.println("Array length = " + arr.length +
                ", ETA = " + result/TESTS_COUNT + "ms.");
    }
}
