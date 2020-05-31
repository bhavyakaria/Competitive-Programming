package com.bhavyakaria.cp.dp.leetcode;

/**
 * @author Bhavya Karia
 * created on 27/05/20
 */
public class CoinChange {
    static int minCoins = Integer.MAX_VALUE;
    static int[] memo;
    public static void main(String[] args) {
        int[] coins = new int[] {1, 2, 5};
        int number = 100;

        memo = new int[3];

        findMinCoins(coins, number, 0, 0);

        System.out.println(minCoins == Integer.MAX_VALUE ? -1 : minCoins);
    }

    public static void findMinCoins(final int[] coins, int number, int amount, int count) {
        if (amount == number) {
            minCoins = Math.min(minCoins, count);
        }

        if (amount > number) {
            return;
        }

        for (int i = 0; i < coins.length; i++) {
            if (amount < number) {
                amount += coins[i];
                findMinCoins(coins, number, amount, count+1);
                amount -= coins[i];
            }
        }
    }

    public int findMinCoins(final int[] coins, int number) {
        int n = coins.length;

        int[][] memo = new int[n+1][number+1];

        for (int i = 1; i < memo.length; i++) {
            memo[i][0] = 0;
        }

        for (int i = 0; i < memo[0].length; i++) {
            memo[i][0] = Integer.MAX_VALUE-1;
        }

        for (int i = 1; i < number+1; i++) {
            if (i % coins[i] == 0) {
                memo[1][i] = i/coins[i];
            } else {
                memo[1][i] = Integer.MAX_VALUE-1;
            }
        }

        for (int i = 2; i < memo.length; i++) {
            for (int j = 1; j < memo[0].length; j++) {
                if (coins[i-1] <= j) {
                    memo[i][j] = Math.min(memo[i][j], memo[i][j] + 1);
                }
            }
        }
        return 0;
    }


}
