package com.home;

import com.home.models.Array;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        Array array = new Array(4);
        array.insert(152);
        array.insert(252);
        array.insert(352);
        array.insert(452);
        array.print();
        array.insertAt(5,3);
        System.out.println("Inserted 5 at position 3");
        array.print(); //1235
        array.insertAt(5,2);
        System.out.println("Inserted 5 at position 2");
        array.print();
    }


    public static int getFactorial(int num) {
        int res = 1;
        while (num != 1) {
            res = res * num--;
        }
        return res;
    }

    public static int getFactorial2(int num) {
        int res = 1;
        for (int i = 1; i <= num; i++) {
            res = res * i;
        }
        return res;
    }

}


