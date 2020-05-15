package com.bhavyakaria.cp.dp.common_problems;

import java.util.Arrays;

/**
 * @author Bhavya Karia
 * created on 10/05/2020
 */
public class KnapsackRecursion {

    static int[][] dp;

    public static void main(String[] args) {
        int[] wt = new int[]{60, 100, 120};
        int[] val = new int[]{10, 20, 30};
        int W = 180;
        int n = wt.length;
        dp = new int[n+1][W+1];

        for (int[] ints : dp) Arrays.fill(ints, -1);

        System.out.println(knapsack(wt, val, W, n));
    }

    private static int knapsack(int[] wt, int[]val, int W, int n) {
        if (W == 0 || n == 0) {
            return 0;
        }

        if (dp[n][W] != -1) {
            return dp[n][W];
        }

        if (wt[n-1] <= W) {
            dp[n][W] = Math.max(val[n-1] + knapsack(wt, val, W - wt[n-1], n-1), knapsack(wt, val, W, n-1));
        } else {
            dp[n][W] = knapsack(wt, val, W, n-1);
        }
        return dp[n][W];
    }
}
