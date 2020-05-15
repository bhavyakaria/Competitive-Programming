package com.bhavyakaria.cp.dp.common_problems;

/**
 * @author Bhavya Karia
 * created on 15/05/2020
 * Reference: https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
 */
public class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 10, -30, 40, 70,-100,50,100,-380,50,500, 1000, -240};
        System.out.println(kadaneAlgorithm(arr));
    }

    public static int kadaneAlgorithm(final int[] a) {
        int currMax = a[0];
        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            currMax = Math.max(currMax+a[i], a[i]);
            max = Math.max(currMax, max);
        }
        return max;
    }
}
