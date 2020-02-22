package com.company;

import DI.MergeSort;
import Utils.SpeedTest;

public class RealizeDI {
    public static void exec() {
        final int ARRAY_LENGTH = 1000000;
        final int TESTS_COUNT = 1;
        int[] arr = new int[ARRAY_LENGTH];
        for (int i = 0; i < ARRAY_LENGTH; i++)
            arr[i] = (int) (Math.random() * ARRAY_LENGTH + 1);
        MergeSort ms = new MergeSort(arr);
        SpeedTest<int[]> speedTest = new SpeedTest<>(TESTS_COUNT);
        double result = speedTest.exec(ms);
        System.out.println("Array length = " + arr.length +
                ", ETA = " + result/TESTS_COUNT + "ms.");
    }
}
