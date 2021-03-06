package com.bhavyakaria.cp.dp.common_problems;

/**
 * @author Bhavya Karia
 * created on 10/05/2020
 */
public class KnapsackBottomUp {

    public static void main(String[] args) {
        int[] wt = new int[]{60, 100, 120};
        int[] val = new int[]{10, 20, 30};
        int W = 180;
        int n = wt.length;

        int[][] dp = new int[n+1][W+1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }

        for (int i = 0; i <= W; i++) {
            dp[0][i] = 0;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= W; j++) {
                if (wt[i-1] <= j) {
                    dp[i][j] = Math.max(val[i-1] + dp[i-1][j - wt[i-1]], dp[i-1][j]);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.println(dp[n][W]);
    }
}
