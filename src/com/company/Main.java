package com.company;

import DI.MergeSort;
import Factory.SortFactory.MergeSortFactory;
import Factory.SortFactory.QuickSortFactory;
import Utils.ArrayCreate;

public class Main {

    public static void main(String[] args) {
        final int ARRAY_LENGTH = 5;
        final int TEST_COUNT = 1;

//        RealizeDI.exec(ARRAY_LENGTH);
//        RealizeObserver.exec();
//        RealizeSingleton.exec();

//        int[] unsortedArray = ArrayCreate.UnsortedArray(ARRAY_LENGTH);
        int[] unsortedArray = new int[]{5, 2, 1};
        MergeSortFactory msf = new MergeSortFactory();
        QuickSortFactory qsf = new QuickSortFactory();
        RealizeFactory.exec(msf, unsortedArray, ARRAY_LENGTH, TEST_COUNT);
        RealizeFactory.exec(qsf, unsortedArray, ARRAY_LENGTH, TEST_COUNT);
    }
}
