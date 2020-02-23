package com.company;

import Factory.AppFactory;
import Factory.SortFactory.MergeSortFactory;
import Utils.ArrayCreate;

public class RealizeFactory implements Realize {

    public static void exec(int ARRAY_LENGTH) {
        int[] arr = ArrayCreate.UnsortedArray(ARRAY_LENGTH);
        MergeSortFactory msf = new MergeSortFactory();
        AppFactory app = new AppFactory(msf, arr);
        app.exec();
        int[] sortedArr = app.getArr();
        System.out.println("Abstract Factory successfully done...");
//        String comma = " ";
//        for (int val : sortedArr)
//            System.out.print(val + comma);
    }
}
