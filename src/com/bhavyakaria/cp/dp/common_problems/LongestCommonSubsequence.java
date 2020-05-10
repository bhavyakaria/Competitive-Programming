package com.bhavyakaria.cp.dp.common_problems;

public class LongestCommonSubsequence {
    static int[][] dp;
    public static void main(String[] args) {
        String one = "abcdgh";
        String two = "abdefhg";

        int n = one.length();
        int m = two.length();

        dp = new int[n+1][m+1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println(lcs(one, two, one.length(), two.length()));
    }

    public static int lcs(String s, String t, int n, int m) {
        if (m == 0 || n == 0) {
            return 0;
        }

        if (dp[n][m] != -1) {
            return dp[n][m];
        }

        if (s.charAt(n-1) == t.charAt(m-1)) {
            dp[n][m] = 1 + lcs(s, t, n-1, m-1);
        } else {
            dp[n][m] = Math.max(lcs(s, t, n-1, m), lcs(s, t, n, m-1));
        }
        return dp[n][m];
    }
}
