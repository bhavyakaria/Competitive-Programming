package com.bhavyakaria.cp.dp.atcoder.contest044;

import java.util.Scanner;

/**
 * @author Bhavya Karia
 * created on 25/05/20
 */
public class PayToWin {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            int t = s.nextInt();

            while (t-- > 0) {
                int[] weight = new int[]{2, 3, 5, 1};
                int[] val = new int[4];
                int N = s.nextInt();
                for (int i = 0; i < 4; i++) {
                    val[i] = s.nextInt();
                }


            }

        } catch (Exception e) {

        }
    }

    public int minCoinsReq(int[] weight, int[] val, int N, int x, int y) {

        if (x == 0 || N == 0 || y >= N) {
            return 0;
        }

        int num;
        if (x == weight.length) {
            num = N - 1;
        } else {
            num = N - N*weight[x-1];
        }

        if (num == 0) {
            return val[x-1];
        } else if (num < 0) {
            return minCoinsReq(weight, val, N, x - 1, y);
        } else {
            return Math.min(val[x-1] + minCoinsReq(weight, val, num, x - 1, y + num), minCoinsReq(weight, val, num, x - 1, y + num));
        }

    }
}


