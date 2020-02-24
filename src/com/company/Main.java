package com.company;

import DI.MergeSort;
import Factory.SortFactory.MergeSortFactory;
import Factory.SortFactory.QuickSortFactory;
import Utils.ArrayCreate;

public class Main {

    public static void main(String[] args) {
        final int ARRAY_LENGTH = 2500000;
        final int TEST_COUNT = 30;

//        RealizeDI.exec(ARRAY_LENGTH);
//        RealizeObserver.exec();
//        RealizeSingleton.exec();

        int[] unsortedArray = ArrayCreate.UnsortedArray(ARRAY_LENGTH);
        MergeSortFactory msf = new MergeSortFactory();
        QuickSortFactory qsf = new QuickSortFactory();
        System.out.print("QuickSort: ");
        long start = System.currentTimeMillis();
        for (int i = 0; i < TEST_COUNT; i++)
            RealizeFactory.exec(qsf, unsortedArray, ARRAY_LENGTH, TEST_COUNT);
        long res = System.currentTimeMillis() - start;
        System.out.printf("Time for sort (%d) = %.2fms\n", unsortedArray.length, (double) (res / TEST_COUNT) / 1000);

        System.out.print("MergeSort: ");
        start = System.currentTimeMillis();
        for (int i = 0; i < TEST_COUNT; i++)
            RealizeFactory.exec(msf, unsortedArray, ARRAY_LENGTH, TEST_COUNT);
        res = System.currentTimeMillis() - start;
        System.out.printf("Time for sort (%d) = %.2fms\n", unsortedArray.length, (double) (res / TEST_COUNT) / 1000);
    }
}
