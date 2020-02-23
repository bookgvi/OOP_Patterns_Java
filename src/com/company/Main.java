package com.company;

import DI.MergeSort;
import Factory.SortFactory.MergeSortFactory;
import Factory.SortFactory.QuickSortFactory;
import Utils.ArrayCreate;

public class Main {

    public static void main(String[] args) {
        final int ARRAY_LENGTH = 100000000;
        final int TEST_COUNT = 1;

//        RealizeDI.exec(ARRAY_LENGTH);
//        RealizeObserver.exec();
//        RealizeSingleton.exec();

        int[] unsortedArray = ArrayCreate.UnsortedArray(ARRAY_LENGTH);
        MergeSortFactory msf = new MergeSortFactory();
        QuickSortFactory qsf = new QuickSortFactory();
        System.out.print("QuickSort: ");
        RealizeFactory.exec(qsf, unsortedArray, ARRAY_LENGTH, TEST_COUNT);
        System.out.print("MergeSort: ");
        RealizeFactory.exec(msf, unsortedArray, ARRAY_LENGTH, TEST_COUNT);
    }
}
