package com.bhavyakaria.cp.sorting_algos;

import java.util.Arrays;

/**
 * @author Bhavya Karia
 * created on 25/06/20
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] inputArray = new int[]{30, 20, 50, 90, 60, 40, 70, 10};

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i+1; j < inputArray.length; j++) {
                if (inputArray[j] < inputArray[i]) {
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[i];
                    inputArray[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(inputArray));
    }
}
