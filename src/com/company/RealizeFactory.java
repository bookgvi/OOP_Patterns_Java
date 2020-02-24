package com.company;

import Factory_DI.AppFactory;
import Factory_DI.SortFactory.MergeSortFactory;
import Factory_DI.SortFactory.QuickSortFactory;
import Utils.ArrayCreate;

public class RealizeFactory {

    public static void exec() {
        final int ARRAY_LENGTH = 2500000;
        final int TEST_COUNT = 30;

        int[] unsortedArray = ArrayCreate.UnsortedArray(ARRAY_LENGTH);


        /*
         * Merge sort
         */
        System.out.print("MergeSort: ");
        long start = System.currentTimeMillis();
        for (int i = 0; i < TEST_COUNT; i++)
            new AppFactory(new MergeSortFactory(), unsortedArray).exec();
        long res = System.currentTimeMillis() - start;
        System.out.printf("Time for sort (%d) = %.2f sec.\n", ARRAY_LENGTH, (double) (res / TEST_COUNT) / 1000);

        /*
        * Quick sort
        */
        System.out.print("QuickSort: ");
        start = System.currentTimeMillis();
        for (int i = 0; i < TEST_COUNT; i++)
            new AppFactory(new QuickSortFactory(), unsortedArray).exec();
        res = System.currentTimeMillis() - start;
        System.out.printf("Time for sort (%d) = %.2f sec.\n", ARRAY_LENGTH, (double) (res / TEST_COUNT) / 1000);
    }
}
