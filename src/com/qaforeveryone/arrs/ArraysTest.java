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
        System.out.println(numOdd + "    " + Arrays.toString(arr1));
        arrOdd = new int[numOdd];// not 10
        arrEven = new int[n - numOdd];

        for (int i = 0, j = 0; i < n || j < numOdd; i++) {
            if (arr1[i] % 2 != 0) {
                arrOdd[j] = arr1[i];
                j++;
            }
        }
        System.out.println(numOdd + "    " + Arrays.toString(arrOdd));

        for (int i = 0, j = 0; i < n || j < (n - numOdd); i++) {
            if (arr1[i] % 2 == 0) {
                arrEven[j] = arr1[i];
                j++;
            }
        }
        System.out.println(n - numOdd + "    " + Arrays.toString(arrEven));

        for (int i = n - 1, j = 0; i > -1 || j < (n - numOdd); i--) {
            if (arr1[i] % 2 == 0) {
                arrEven[j] = arr1[i];
                j++;
            }
        }
        System.out.println((n - numOdd) + "    " + Arrays.toString(arrEven));

    }
}
