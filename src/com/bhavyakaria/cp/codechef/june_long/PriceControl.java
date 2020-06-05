package com.bhavyakaria.cp.codechef.june_long;

import java.util.Scanner;

/**
 * @author Bhavya Karia
 * created on 05/06/20
 */
public class PriceControl {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            int t = s.nextInt();

            while (t-- > 0) {
                int n = s.nextInt();
                int k = s.nextInt();

                int total_loss = 0;
                int[] prices = new int[n];
                for (int i = 0; i < n; i++) {
                    prices[i] = s.nextInt();

                    if (prices[i] > k) {
                        total_loss += prices[i] - k;
                    }
                }
                System.out.println(total_loss);
            }
        } catch (Exception e) {

        }
    }
}
