package com.bhavyakaria.cp.sorting_algos;

import java.util.Arrays;

/**
 * @author Bhavya Karia
 * created on 14/07/20
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{10,50,70,30,90,80,20};
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int partition = partition(arr, start, end);
            quickSort(arr, start, partition-1);
            quickSort(arr, partition+1, end);
        }
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start;

        for (int j = start; j < end; j++) {
            if (arr[j] < pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, end);
        return i;
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
