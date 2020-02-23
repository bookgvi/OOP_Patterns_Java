package com.company;

import Factory.AppFactory;
import Factory.AppFactoryWithSpeedTest;
import Factory.SortFactory.MergeSortFactory;
import Utils.ArrayCreate;

public class RealizeFactory implements Realize {

    public static void exec(int ARRAY_LENGTH, int TEST_COUNT) {
        int[] arr = ArrayCreate.UnsortedArray(ARRAY_LENGTH);
        MergeSortFactory msf = new MergeSortFactory();
//        AppFactory app = new AppFactory(msf, arr);
//        app.exec();
//        int[] sortedArr = app.getArr();


        /*
         * Замер скорости работы алгоритма
         */
        AppFactoryWithSpeedTest appWithTest = new AppFactoryWithSpeedTest(msf, arr, TEST_COUNT);
        System.out.printf("Скорость сортировки массива %d элементов = %.2f мсек.\n", ARRAY_LENGTH, (double) appWithTest.ETA()/1000);

        System.out.println("Abstract Factory successfully done...");
    }
}
