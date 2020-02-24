package com.company;

import Factory_DI.AppFactory;
import Factory_DI.Interfaces.ExecuteFactory;
import Factory_DI.Interfaces.Realize;

public class RealizeFactory implements Realize {

    @Override
    public void exec(ExecuteFactory sf, int[] arr, int ARRAY_LENGTH, int TEST_COUNT) {

        AppFactory appFactory = new AppFactory(sf, arr);
        appFactory.exec();

        /*
         * Замер скорости работы алгоритма
         */
//        AppFactoryWithSpeedTest appWithTest = new AppFactoryWithSpeedTest(sf, arr, TEST_COUNT);
//        System.out.printf("Скорость сортировки массива %d элементов = %.2f мсек.\n", ARRAY_LENGTH, (double) appWithTest.ETA()/1000);

        //        Вывод отсортированного массива
//        for (int val: appWithTest.getArr()) {
//            System.out.print(val + " ");
//        }
//        System.out.println();
    }
}
