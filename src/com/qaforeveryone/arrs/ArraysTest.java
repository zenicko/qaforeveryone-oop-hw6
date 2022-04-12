package com.qaforeveryone.arrs;

import java.util.Arrays;

public class ArraysTest {
    /**
     * Создать массив четных чисел и массив нечетных чисел
     * из элементов массива из 10 случайных положительных целых чисел.
     * Рандомный массив создала от 0 до макс значения int ,
     * теперь нужно делать проверку на четность if array[i] % 2 == 0 ;
     * а затем записывать в новый массив четных чисел,
     * else записывать в массив нечетных чисел.
     *
     * @param args
     */
    public static void main(String[] args) {
        int
                n = 10,
                numOdd = 0;

        int[] arr1 = new int[n];
        int[]
                arrOdd,
                arrEven;

        for (int i = 0; i < n; i++) {
            arr1[i] = Math.abs((int) (Math.random() * Integer.MAX_VALUE));
            if (arr1[i] % 2 != 0) numOdd++;
            //Math.abs((int) (Math.random() * Integer.MAX_VALUE) * 100);
        }
        System.out.println(numOdd + "    "+ Arrays.toString(arr1));
  

    }
}
