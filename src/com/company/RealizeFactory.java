package com.company;

import Factory.AppFactoryWithSpeedTest;
import Factory.Interfaces.ExecuteFactory;

public class RealizeFactory implements Realize {

    public static void exec(ExecuteFactory sf, int[] arr, int ARRAY_LENGTH, int TEST_COUNT) {
        for (int val: arr) {
            System.out.print(val + " ");
        }

//        AppFactory app = new AppFactory(msf, arr);
//        app.exec();
//        int[] sortedArr = app.getArr();


        /*
         * Замер скорости работы алгоритма
         */
        AppFactoryWithSpeedTest appWithTest = new AppFactoryWithSpeedTest(sf, arr, TEST_COUNT);
        System.out.printf("Скорость сортировки массива %d элементов = %.2f мсек.\n", ARRAY_LENGTH, (double) appWithTest.ETA()/1000);

        for (int val: appWithTest.getArr()) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
