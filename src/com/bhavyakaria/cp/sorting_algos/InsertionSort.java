package com.bhavyakaria.cp.sorting_algos;

import java.util.Arrays;

/**
 * @author Bhavya Karia
 * created on 20/06/20
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] inputArr = new int[]{10, 50, 30, 60, 70, 20, 40, 90, 80};
        int j = 0;
        for (int i = 0; i < inputArr.length; i++) {
            j=i;
            while (j > 0 && (inputArr[j] < inputArr[j-1])) {
                swap(j, j-1, inputArr);
                j = j-1;
            }
        }
        System.out.println(Arrays.toString(inputArr));
    }

    public static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
