package com.bhavyakaria.cp.backtracking;

import java.util.Arrays;

/**
 * Reference: https://www.youtube.com/watch?v=eUnNw2lR01M&t=548s
 */

public class Permutation {
    public static void main(String[] args) {
        char[] arr = new char[]{'A', 'B', 'C'};
        findAllPermutation(arr, arr.length , 0);
    }
    
    public static void findAllPermutation(char[] arr, int n, int i) {
        if (i == n) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        for (int j = i; j < n; j++) {
            swap(arr, i, j);
            findAllPermutation(arr, n, i+1);
            swap(arr, i, j);
        }
    }

    public static void swap(char arr[], int a, int b) {
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
