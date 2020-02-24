package com.company;

import Factory_DI.SortFactory.MergeSortFactory;
import Factory_DI.SortFactory.QuickSortFactory;
import Utils.ArrayCreate;
import Utils.SpeedTest;

public class Main {

    public static void main(String[] args) {
        final int ARRAY_LENGTH = 2500000;
        final int TEST_COUNT = 30;

        RealizeObserver.exec();
        RealizeSingleton.exec();

        int[] unsortedArray = ArrayCreate.UnsortedArray(ARRAY_LENGTH);
        RealizeFactory rf = new RealizeFactory();
        SpeedTest speedTest = new SpeedTest(rf, ARRAY_LENGTH, TEST_COUNT);

        MergeSortFactory msf = new MergeSortFactory();
        QuickSortFactory qsf = new QuickSortFactory();
        System.out.print("QuickSort: ");
        speedTest.invoke(qsf, unsortedArray);

        System.out.print("MergeSort: ");
        speedTest.invoke(msf, unsortedArray);
    }
}
