package com.bhavyakaria.cp.sorting_algos;

import java.util.Arrays;

public class CountSort {

    public static void main(String[] args) {
        CountSort countSort = new CountSort();

        int[] arr = new int[]{3, 5, 8, 6, 9, 4, 6, 5, 7, 9};
        countSort.countingSort(arr);
    }

    public void countingSort(int[] arr) {
        int[] countArr = new int[100];
        Arrays.fill(countArr, 0);

        for (int i = 0; i < arr.length; i++) {
            countArr[arr[i]]++;
        }

        for (int i = 0; i < countArr.length; i++) {
            while (countArr[i] > 0) {
                System.out.print(i+" ");
                countArr[i]--;
            }
        }
    }
}
